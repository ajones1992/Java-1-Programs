import java.util.*;
public class Main
{
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();
    static final String banner = 
           "___________________  \n"+
           "| _______________ |  \n"+
           "| |XXXXXXXXXXXXX| |  \n"+
           "| |XXXXXXXXXXXXX| |  \n"+
           "| |XXXXXXXXXXXXX| |  \n"+
           "| |XXXXXXXXXXXXX| |  \n"+
           "| |XXXXXXXXXXXXX| |  \n"+
           "|_________________|  \n"+
           "    _[_______]_      \n"+
           "___[___________]___  \n"+
           "|         [_____] []| \n"+
           "|         [_____] []| \n"+
           "L___________________J \n";
           
	public static void main(String[] args) {
		System.out.println(banner);
		System.out.print("How many problems? ");
		int probQuant = s.nextInt();
		int difficulty = getLevel();
		int answer = 0, correct = probQuant, first = 0, second = 0;
		char op = '?';
		for (int i = 0; i < probQuant; i++) {
		    first = r.nextInt(upper(difficulty-1)-lower(difficulty-1))+lower(difficulty-1);
		    second = r.nextInt(upper(difficulty-1)-lower(difficulty-1))+lower(difficulty-1);
		    op = randOperator();
		    System.out.printf("%d %c %d = ", first, op, second);
		    answer = compute(op, first, second);
		    int response = s.nextInt();
		    if (response == answer)
		        System.out.println("Good job!");
		    else {
		        System.out.printf("Wrong. The answer is %d.\n", answer);
		        correct -= 1;
		    }
		}
		System.out.printf("You answered %.2f percent correct.", (correct*100.0)/probQuant);
	}
	static int lower(int level) {
	    switch (level) {
	        case 1: return 10;
	        case 2: return 100;
	        case 3: return 1000;
	        default: return 0;
	    }
	}
	static int upper(int level) {
	    switch (level) {
	        case 1: return 100;
	        case 2: return 1000;
	        case 3: return 10000;
	        default: return 10;
	    }
	}
	static int getLevel() {
		System.out.print("Specify a difficulty level\n" +
		                 "1)   Easy\n2)   Medium\n" +
		                 "3)   Hard\n4)   Impossible\n" +
		                 "Choice: ");
		int levChoice = s.nextInt();
		if (levChoice > 4 | levChoice < 1) {
		    System.out.println("Incorrect value, Easy difficulty default.");
		    return 1;
		} else
		    return levChoice;
	}
	static char randOperator() {
        int random_number = r.nextInt(5);
        switch (random_number) {
            case 0: return '+';
            case 1: return '-';
            case 2: return '*';
            case 3: return '/';
            case 4: return '%';
            default: return '?';
        }
    }
    static int compute(char operator,int first,int second) {
        switch (operator) {
            case '+': return first+second;
            case '-': return first-second;
            case '*': return first*second;
            case '/': return first/second;
            case '%': return first%second;
            default: return Integer.MIN_VALUE;
        }
    }
}

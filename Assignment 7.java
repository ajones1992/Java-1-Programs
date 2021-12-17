import java.util.*;
public class Main
{
    public static char operator = 'i';
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    Random randNum = new Random();
	    
	    System.out.print("How many problems? ");
	    int quantProb = s.nextInt();
	    
	    for (int i = 0; i<quantProb;i++) {
	        operator = randOperator();
	        int rand_numb1 = randNum.nextInt(100)+1;
            int rand_numb2 = randNum.nextInt(100)+1;
	        compute(operator,rand_numb1,rand_numb2);
	    }
	    
	}
	    
    public static char randOperator() {
        Random random = new Random();
        char op = 'i';
        int random_number = random.nextInt(5);
        
        switch (random_number) {
            case 0:
                op = '+';
                break;
            case 1:
                op = '-';
                break;
            case 2:
                op = '*';
                break;
            case 3:
                op = '/';
                break;
            case 4:
                op = '%';
                break;
        }
        
        return operator = op;
    }

    public static void compute(char operator,int first,int second) {
        switch (operator) {
            case '+':
                System.out.printf("%5d + %5d = %5d\n",first,second,first+second);
                break;
            case '-':
                System.out.printf("%5d - %5d = %5d\n",first,second,first-second);
                break;
            case '*':
                System.out.printf("%5d * %5d = %5d\n",first,second,first*second);
                break;
            case '/':
                System.out.printf("%5d / %5d = %5d\n",first,second,first/second);
                break;
            case '%':
                System.out.printf("%5d + %5d = %5d\n",first,second,first%second);
                break;
        }
    }
}


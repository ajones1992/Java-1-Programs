import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner amount = new Scanner(System.in);
	    
	    String output = "", name = "";
	    double sum = 0, score = 0;
	    
	    System.out.println("How many students: ");
	    int studentNum = amount.nextInt();
	    System.out.println("How many exams per student: ");
	    int examNum = amount.nextInt();
	    amount.nextLine();
	    
	    for (int i=0; i<studentNum; i++) {
	        sum = 0;
	        System.out.printf("Enter the name for student %d: ", i+1);
	        name = amount.nextLine();
	        for (int j=0; j<examNum; j++) {
	            System.out.printf("Enter the score for exam %d: ", j+1);
	            score = amount.nextInt();
	            sum += score;
	            amount.nextLine();
	        }
	        output += String.format("%s's average is %.2f\n", name, (sum/examNum));
	     }
	     System.out.println(output);
	}
}


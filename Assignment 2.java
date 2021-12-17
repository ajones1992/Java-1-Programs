import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.print("Enter the number of books purchased: ");
	    int bookAmount = s.nextInt();
	    
	    if (bookAmount >= 8) {
	        System.out.println("Points awarded: 60");
	    } else if (bookAmount >= 6) {
	        System.out.println("Points awarded: 30");
	    } else if (bookAmount >= 4) {
	        System.out.println("Points awarded: 15");
	    } else if (bookAmount >= 2) {
	        System.out.println("Points awarded: 5");
	    } else {
	        System.out.println("No Points awarded this month.");
	    }
	}
}


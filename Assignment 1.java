import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    
	    System.out.print("Give me the price of up to five (5) items: ");
	    double item1 = keyboard.nextDouble();
	    double item2 = keyboard.nextDouble();
	    double item3 = keyboard.nextDouble();
	    double item4 = keyboard.nextDouble();
	    double item5 = keyboard.nextDouble();
	    
	    double subtotal = item1 + item2 + item3 + item4 + item5;
	    double tax = 0.07;
	    double total = subtotal + (subtotal * tax);
	    
	    System.out.println("Subtotal is " + subtotal);
	    System.out.println("Sales tax in this area is " + tax);
	    System.out.println("Your total due today is " + total);
	    System.out.println("Will that be cash or credit?");
	}
}

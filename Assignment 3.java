import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner packageABC = new Scanner(System.in);
        
        double total = 0;
        
        System.out.println("Enter the letter of the package you purchased (A, B, or C): ");
        char customerPackage = packageABC.next().charAt(0);
        
        System.out.println("Enter the minutes you used this month: ");
        int minutes = packageABC.nextInt();
        
        if (customerPackage == 'a' | customerPackage == 'A') {
            if (minutes > 450) {
                total = 39.99 + (minutes - 450) * 0.45;
            } else {
                total = 39.99;
            }    
        } else if (customerPackage == 'b' | customerPackage == 'B') {
            if (minutes > 900) {
                total = 59.99 + (minutes - 900) * 0.45;
            } else {
                total = 59.99;
            }    
        } else if (customerPackage == 'c' | customerPackage == 'C') {
            total = 69.99;
        } else {
            System.out.println("Error: Improper input");
        }
        System.out.println("The monthly bill is $" + String.format("%.2f", total));    
    }
}



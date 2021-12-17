import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args){
        Scanner guessInput = new Scanner(System.in);
        
        Random random = new Random();
        int random_number = random.nextInt(10)+1;
        
        int guessCount = 0;
        
        System.out.println("Welcome back! Wanna guess my number?");
        System.out.println("This time I'll let you guess until you get it!");
        int guess = guessInput.nextInt();
        
        while (guess != random_number) {
            if (guess > random_number) {
                System.out.println("Too high, stop flying!");
            } else if (guess < random_number) {
                System.out.println("Too low, stop licking the gorund!");
            }
            guessCount++;
            guess = guessInput.nextInt();
        }
        
        System.out.printf("Yay! It only took you %d tries...", guessCount);
    }
}


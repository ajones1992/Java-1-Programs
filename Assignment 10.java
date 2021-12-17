import java.util.*;

public class Main{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        String input = "y", guess = "0";
        int randWord = 0;
        while (!"q".equals(input)) {
           randWord = r.nextInt(WORDS.length);
           System.out.printf("Scrambled word: %s\n", WORDS[randWord][0]);
           System.out.print("Your guess: ");
           guess = s.nextLine();
           while (!WORDS[randWord][1].equals(guess)) {
               System.out.print("\nIncorrect! Try again. Your guess: ");
               guess = s.nextLine();
           }
           System.out.print("\nCorrect! Enter to try again, or q to quit. ");
           input = s.nextLine();
        }
	}
	
    private final static String[][] WORDS = {
      {"TAC",   "CAT"},
      {"HATRE", "EARTH"},
      {"RCA",   "CAR"},
      {"GLOD",  "GOLD"},
      {"YEE",   "EYE"}, 
      {"NTPLA", "PLANT"},
      {"RBID",  "BIRD"},
      {"ETER",  "TREE"},
      {"IARN",  "RAIN"},
      {"NOOM",  "MOON"},
      {"ERCI",  "RICE"},
      {"AWTRE", "WATER"},
      {"IGHLT", "LIGHT"},
      {"CPASE", "SPACE"},
      {"OCLD",  "COLD"},
      {"ATHRE", "HEART"},
      {"EBE",   "BEE"},
      {"GENYER","ENERGY"},
      {"ESED",  "SEED"},
      {"AMRS",  "MARS"}, };

}



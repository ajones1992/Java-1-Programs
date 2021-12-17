import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter name of file to copy: ");
		String filename = keyboard.nextLine();
		Scanner fileScanner = new Scanner(new File(filename));
		
		System.out.print("Enter name of file to copy to: ");
		String copyFile = keyboard.nextLine();
		FileWriter fw = new FileWriter(copyFile);
		
		System.out.print("Enter number of lines to copy: ");
		int lines = keyboard.nextInt();
		
		for (int i = 0; i < lines; i++) {
		    if (fileScanner.hasNextLine()) {
		        String line = fileScanner.nextLine();
		        fw.write(line + "\n");
		    } else
		        break;
		}
		fileScanner.close();
		fw.close();
	}
}

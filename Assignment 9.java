import java.util.*;
public class Main
{
           
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.print("How many months? ");
	    int monthQuant = s.nextInt();
	    double[] rainQuant = new double[monthQuant];
	    for (int i = 0; i < rainQuant.length; i++) {
	        System.out.printf("Enter the rainfall in centimeters for month %d: ", i+1);
	        rainQuant[i] = s.nextDouble();
	    }
	    System.out.printf("Total rainfall: %.2f cm.\n"+
	                      "Average monthly: %.2f cm.\n"+
	                      "Month with most rainfall: %d.\n"+
	                      "Month with least rainfall: %d."
	                      , rainSum(rainQuant), avg(rainQuant), most(rainQuant), least(rainQuant));
	}
	
	static int least(double[] a) {
	    int low = 1;
	    double index = a[0];
	    for (int i = 1; i < a.length; i++) {
	        if (a[i] < index) {
	            index = a[i];
	            low = i+1;
	        }
	        else 
	            low = low;
	    }
	    return low;
	}
	static int most(double[] a) {
	    int high = 1;
	    double index = a[0];
	    for (int i = 1; i < a.length; i++) {
	        if (a[i] > index) {
	            index = a[i];
	            high = i+1;
	        }
	        else 
	            high = high;
	    }
	    return high;
	}
	static double avg(double[] a) {
	    double sum = 0.0;
	    for (int i = 0; i < a.length; i++) {
	        sum += a[i];
	    }
	    return sum/a.length;
	}
	static double rainSum(double[] a) {
	    double sum = 0.0;
	    for (int i = 0; i < a.length; i++) {
	        sum += a[i];
	    }
	    return sum;
	}
}

import java.util.*;

class Shape {
    private double area = 0;
    
    public double getArea() {
        return area;
    }
}
    
class Circle extends Shape {
    private double radius = 0;
    
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
        
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
    
class Rectangle extends Shape {
    private double len = 0;
    private double wid = 0;
    
    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }
        
    public void setLength(double length) {
        len = length;
    }
        
    public void setWidth(double width) {
        wid = width;
    }
        
    public double getLength() {
        return len;
    }
        
    public double getWidth() {
        return wid;
    }
        
    public double getArea() {
        return len * wid;
    }
}
    
public class Main
{
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		
		int input = -1;
		int i = 0;
		double radius, length, width, totalArea;
		totalArea = 0;
		
		while (input != 0) {
		    System.out.println("Create a shape.\nCircle press 1\nRectangle press 2\nExit press 0");
		    input = s.nextInt();
		    if (input == 1) {
		        System.out.println("Enter the radius: ");
		        radius = s.nextDouble();
		        shapes.add(new Circle(radius));
		        i++;
		    } else if (input == 2) {
		        System.out.println("Enter the length: ");
		        length = s.nextDouble();
		        System.out.println("Enter the width: ");
		        width = s.nextDouble();
		        shapes.add(new Rectangle(length, width));
		        i++;
		    } else {
		        for (int j = 0; j<shapes.size(); j++) {
		            totalArea += shapes.get(j).getArea();
		        }
		        System.out.printf("Total area = %f", totalArea);
		    }
		}
	}
}

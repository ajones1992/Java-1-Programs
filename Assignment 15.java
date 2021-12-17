import java.util.*;

class InvalidNameException extends RuntimeException {
    
    public InvalidNameException(String msg) {
        super(msg);
    }
}

class InvalidAgeException extends RuntimeException {
    
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class Person {
    
    private String name;
    private int age;
    Scanner s = new Scanner(System.in);
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        
        while (true) {
            try {
                invalidName(name);
                break;
            } catch(Exception e) {
                System.out.println("Name must not be empty. Try again.");
                name = s.nextLine();
            }
        }
        
        while (true) {
            try {
                invalidAge(age);
                break;
            } catch(Exception e) {
                System.out.println("Age out of range. Try again.");
                age = s.nextInt();
            }
        }
    }
    
    public void setName(String name) {
        this.name = name;
        
        while (true) {
            try {
                invalidName(name);
                break;
            } catch(Exception e) {
                System.out.println("Name must not be empty. Try again.");
                name = s.nextLine();
            }
        }
    }
    
    public void setAge(int age) {
        this.age = age;
        
        while (true) {
            try {
                invalidAge(age);
                break;
            } catch(Exception e) {
                System.out.println("Age out of range. Try again.");
                age = s.nextInt();
            }
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    static void invalidName(String name) throws InvalidNameException {
        if (name.equals(""))
            throw new InvalidNameException("Name must not be empty.");
    }
    
    static void invalidAge(int age) throws InvalidNameException {
        if (age > 130 | age < 0)
            throw new InvalidNameException("Age must be 0-130.");
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        int age;
        
        System.out.println("You will create 3 people. Enter the name for the first.");
        name = s.nextLine();
        System.out.println("Enter the age for the first.");
        age = s.nextInt();
        s.nextLine();
        Person one = new Person(name, age);
        
        System.out.println("Enter the name for the second.");
        name = s.nextLine();
        System.out.println("Enter the age for the second.");
        age = s.nextInt();
        s.nextLine();
        Person two = new Person(name, age);
        
        System.out.println("Enter the name for the third.");
        name = s.nextLine();
        System.out.println("Enter the age for the third.");
        age = s.nextInt();
        s.nextLine();
        Person three = new Person(name, age);
    }
}


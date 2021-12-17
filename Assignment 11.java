import java.util.*;

public class Main
{
    public static class Person
	{
	    private String name, address, phoneNum;
	    Scanner s = new Scanner(System.in);
	    
	    public void setInfo(String personName) {
	        name = personName;
	
	        System.out.println("Enter the street address: ");
	        String street = s.nextLine();
	        System.out.println("Enter the city: ");
	        String city = s.nextLine();
	        System.out.println("Enter the state: ");
	        String state = s.nextLine();
	        System.out.println("Enter the zipcode: ");
	        String zip = s.nextLine();
	        address = street + "\n" + city + "\n" + state + "\n" + zip;
	        System.out.println("Enter the phone number: ");
	        phoneNum = s.nextLine();
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public String getAddress() {
	        return address;
	    }
	    
	    public String getNum() {
	        return phoneNum;
	    }
	}
	public static class Pet
	{
	    private String name, ownerName, ownerAddress, ownerNum;
	    private int age;
	    private boolean vax = false;
	    
	    Scanner s = new Scanner(System.in);
	    
	    public void setInfo(Person x) {
	        
	        ownerName = x.getName();
	        ownerAddress = x.getAddress();
	        ownerNum = x.getNum();
	        
	        System.out.println("Enter the pet's name: ");
	        name = s.nextLine();
	
	        System.out.println("Enter the pet's age: ");
	        int potentialAge = s.nextInt();
	        age = potentialAge >= 0 ? potentialAge : age;
	        if (potentialAge < 0)
	            System.out.println("Invalid age. Default age 0.");
	        s.nextLine();
	        
	        System.out.println("Is the pet vaccinated? (Y/N) ");
	        String answer = s.nextLine();
	        if (answer.equals("Y"))
	            vax = true;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public int getAge() {
	        return age;
	    }
	    
	    public String getVax() {
	        String bool = vax ? "Yes" : "No";
	        return bool;
	    }
	    
	    public String getOwner() {
	        String owner = ownerName + "\n" + ownerAddress + "\n" + ownerNum;
	        return owner;
	    }
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Person x = new Person();
		Pet y = new Pet();
		Pet z = new Pet();
		
		System.out.println("Enter your name: ");
		String user = s.nextLine();
		
		x.setInfo(user);
		y.setInfo(x);
		z.setInfo(x);
		
		System.out.printf("Pet name: %s\n" +
		                  "Pet age: %d\n" +
		                  "Vaccinated: %s\n" +
		                  "Owner: %s\n",
		                  y.getName(), y.getAge(), y.getVax(), y.getOwner());
		                  
		System.out.printf("Pet name: %s\n" +
		                  "Pet age: %d\n" +
		                  "Vaccinated: %s\n" +
		                  "Owner: %s\n",
		                  z.getName(), z.getAge(), z.getVax(), z.getOwner());
	}
}


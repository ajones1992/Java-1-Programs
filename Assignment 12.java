import java.util.*;

class Employee {
    private String name, department, jobTitle;
    private int idNum;
    
    public Employee() {
        name = "";
        department = "";
        jobTitle = "";
        idNum = 0;
    }
    
    public Employee(String n) {
        name = n;
        department = "";
        jobTitle = "";
        idNum = 0;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setDepartment(String d) {
        department = d;
    }
    
    public void setJob(String title) {
        jobTitle = title;
    }
    
    public void setID(int id) {
        idNum = id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public String getJob() {
        return jobTitle;
    }
    
    public int getID() {
        return idNum;
    }
}

public class Main
{
	public static void main(String[] args) {
		ArrayList<Employee> employeeRoster = new ArrayList<>();
		Employee e1 = new Employee("Susan Meyers");
		Employee e2 = new Employee("Mark Jones");
		Employee e3 = new Employee("Joy Rogers");
		
		e1.setID(47899);
		e1.setDepartment("Accounting");
		e1.setJob("Vice President");
		
		e2.setID(39119);
		e2.setDepartment("IT");
		e2.setJob("Programmer");
		
		e3.setID(81774);
		e3.setDepartment("Manufacturing");
		e3.setJob("Engineer");
		
		employeeRoster.add(e1);
		employeeRoster.add(e2);
		employeeRoster.add(e3);
		
		for (int i=0;i<employeeRoster.size();i++) {
		    System.out.print(employeeRoster.get(i).getName() + "  "
		                     + employeeRoster.get(i).getID() + "  "
		                     + employeeRoster.get(i).getDepartment() + "  "
		                     + employeeRoster.get(i).getJob() + "\n");
		}
	}
}

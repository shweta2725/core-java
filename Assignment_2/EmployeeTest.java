import java.util.Scanner;

/*
			Create a class called Employee that includes three instance variables—a 
			first name (type String), a last name (type String) and a monthly salary 
			(double). Provide a constructor that initializes the three instance variables. 
			Provide a set and a get method for each instance variable. If the monthly 
			salary is not positive, do not set its value. Write a test application named 
			EmployeeTest that demonstrates class Employee’s capabilities. Create two 
			Employee objects and display each object’s yearly salary. Then give each 
			Employee a 10% raise and display each Employee’s yearly salary again.

 */



class Employee{
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(){
	
		this.firstName = "";
		this.lastName = "";
		this.salary = 0.0;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary < 0) {
			
		}
		else{
			this.salary = salary;
		}		
	}
	
	public void acceptRecord(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		setFirstName(sc.nextLine());
		System.out.println("Enter Last Name : ");
		setLastName(sc.nextLine());
		System.out.println("Enter Salary Name : ");
		setSalary(sc.nextDouble());
			
	}
	
	public void displayRecord(){
		
		System.out.println("First Name : "+ this.firstName);	
		System.out.println("Last Name : "+ this.lastName);		
		System.out.println("Salary Name : "+this.salary * 12);
		
	}
	
}



public class EmployeeTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.acceptRecord();
		e2.acceptRecord();
		
		System.out.println("Yearly salary : " + e1.getSalary()*12);
		System.out.println("Yearly salary : " + e2.getSalary()*12);
		
		System.out.println();
		
		System.out.println("10% incremented salary :" + e1.getSalary() * 12 * 1.10);
		System.out.println("10% incremented salary :" + e2.getSalary() * 12 * 1.10);
		
		
	}
	
	
	
	
	
}
import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
	System.out.println("Please enter input the employee's first name: ");
	firstName= scan.nextLine();

	System.out.println("Please input the employee's last name");
	lastName= scan.nextLine();

	System.out.println("Please input the empoyee's monthly salary: ");
	salary= scan.nextDouble();
	scan.nextLine();

	}

        

    public String toString() {
        String output= "Employee information: " + firstName + " " + lastName + "," +age +","+ salary;
	return output;
    }
}
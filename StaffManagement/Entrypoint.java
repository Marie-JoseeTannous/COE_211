import java.util.Scanner;

public class Entrypoint{

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);


		Employee emp = new Employee("","",0,0);
	
		System.out.println("Please input the employee's first name: ");
		String first=scan.nextLine();
		System.out.println("Please input the employee's last name: ");
		String last=scan.nextLine();
		System.out.println("Please input the employee's age: ");
		int age=scan.nextInt();
		System.out.println("Please input the employee's monthly salary: ");
		double monthlySalary=scan.nextDouble();
		 
		emp.setFirst(first);
		emp.setLast(last);
		emp.setAge(age);
		emp.setMonthlySalary(monthlySalary);

		System.out.println("Employee information: " + emp);
		
} 	
	}



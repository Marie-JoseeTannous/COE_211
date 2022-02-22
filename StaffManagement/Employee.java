
public class Employee{
	private String first,last;
	private int age;
	private double monthlySalary;

	public Employee(String first,String last,int age,double monthlySalary){
		this.first=first;
		this.last=last;
		this.age=age;
		this.monthlySalary=monthlySalary;

	}
	public void  setFirst(String first) {
		this.first = first;
	}
	
	public void setLast(String last) {
		this.last = last;
	}
 	public void setAge(int age){
		this.age = age;
	}
	public void setMonthlySalary(double monthlySalary){
		this.monthlySalary = monthlySalary;
	}
	public String toString(){
		String output = first+" "+last+", "+age+", "+monthlySalary;
		return output;
	}	
}
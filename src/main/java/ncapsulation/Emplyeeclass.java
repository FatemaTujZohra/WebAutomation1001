package ncapsulation;

public class Emplyeeclass {

	public static void main(String[] args) {
		Employee Lutfor= new Employee ();
		Lutfor.setSalary(4000);
		Lutfor.setBonus(1000);
		Lutfor.calculateTotalPay();
		
	

	}
	

}
 class Employee{
	private double salary;
	private double bonus;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
 	 
 
 
 public void calculateTotalPay() {
	 
	 
	 double totalPay= salary+ bonus;
	 System.out.println("Total Pay= " + totalPay);
 }
 }
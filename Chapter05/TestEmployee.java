
class Employee	{
	private double employeeSalary = 1800;
	
	public Employee()	{
		System.out.print("构造方法被调用 !");
	}
	
	public void getEmployeeSalary()	{
		System.out.println("职员的基本薪水为: " + employeeSalary);
	}

}

public class TestEmployee	{
	public static void main(String [] args)	{
		Employee e1 = new Employee();
		e1.getEmployeeSalary();
		Employee e2 = new Employee();
		e2.getEmployeeSalary();
	}
	
}



class Employee	{
	private String employeeName;
	int employeeNo;
	private double employeeSalary;
	static double mini_salary = 600;
	
	public Employee(String name)	{
		employeeName = name;
	}
	
	public double getEmployeeSalary()	{
		return employeeSalary;
	}
	
	public void setEmployeeSalary(double salary)	{
		employeeSalary = salary + mini_salary;
	}
	
	public String toString()	{
		return ("姓名: " + employeeName + ": 工资: ");
	}
}

class CommonEmployee extends Employee	{
	private double bonus;
	
	public CommonEmployee(String name, double bonus)	{
		super(name);
		this.bonus = bonus;
	}
	
	public void setBonus(double newBonus)	{
		bonus = newBonus;
	}
	
	public double getEmployeeSalary()	{
		return bonus + mini_salary;
	}
	
	public String toString()	{
		String s;
		s = super.toString();
		
		return (s + getEmployeeSalary() + " ");
	}
	
}

public class Test_Constructor	{
	public static void main(String args [])		{
		Employee employee = new Employee("李   平");
		employee.setEmployeeSalary(1200);
		
		System.out.println("员工的基本信息为： " + employee.toString() + employee.getEmployeeSalary());
		CommonEmployee commonEmployee = new CommonEmployee("李晓云", 400);
		
		System.out.println("员工的基本信息为: " + commonEmployee.toString());
		employee = new CommonEmployee("李涛", 800);
		System.out.println("员工的基本信息为: " + employee.toString());
	}
}



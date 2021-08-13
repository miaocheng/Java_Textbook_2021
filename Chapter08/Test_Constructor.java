

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
		return ("����: " + employeeName + ": ����: ");
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
		Employee employee = new Employee("��   ƽ");
		employee.setEmployeeSalary(1200);
		
		System.out.println("Ա���Ļ�����ϢΪ�� " + employee.toString() + employee.getEmployeeSalary());
		CommonEmployee commonEmployee = new CommonEmployee("������", 400);
		
		System.out.println("Ա���Ļ�����ϢΪ: " + commonEmployee.toString());
		employee = new CommonEmployee("����", 800);
		System.out.println("Ա���Ļ�����ϢΪ: " + employee.toString());
	}
}



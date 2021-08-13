
class Employee	{
	private double employeeSalary = 1800;
	private String employeeName = "姓名未知";
	private int employeeNo;
	
	Employee()	{
		System.out.println("不带参数的构造方法被调用 !");
	}
	
	public Employee(String name)	{
		employeeName = name;
		System.out.println("带有姓名参数的构造方法被调用 !");
	}
	
	public Employee(String name, double salary)	{
		employeeName = name;
		employeeSalary = salary;
		System.out.println("带有姓名和薪水这两个参数的构造方法被调用 !");
	}
	
	public String toString()	{
		String s;
		s = "编号:" + employeeNo + " 姓名: " + employeeName + " 工资: " + employeeSalary;
		
		return s;
	}

}


public class TestEmployee_p108	{
	public static void main(String [] args)	
	{
		Employee e1 = new Employee();
		System.out.println(e1.toString());
		Employee e2 = new Employee("李萍");
		System.out.println(e2.toString());
		Employee e3 = new Employee("王嘉怡", 2400);
		System.out.println(e3.toString());
	
	}

}



class Employee	{
	private double employeeSalary = 1800;
	private String employeeName = "����δ֪";
	private int employeeNo;
	
	Employee()	{
		System.out.println("���������Ĺ��췽�������� !");
	}
	
	public Employee(String name)	{
		employeeName = name;
		System.out.println("�������������Ĺ��췽�������� !");
	}
	
	public Employee(String name, double salary)	{
		employeeName = name;
		employeeSalary = salary;
		System.out.println("����������нˮ�����������Ĺ��췽�������� !");
	}
	
	public String toString()	{
		String s;
		s = "���:" + employeeNo + " ����: " + employeeName + " ����: " + employeeSalary;
		
		return s;
	}

}


public class TestEmployee_p108	{
	public static void main(String [] args)	
	{
		Employee e1 = new Employee();
		System.out.println(e1.toString());
		Employee e2 = new Employee("��Ƽ");
		System.out.println(e2.toString());
		Employee e3 = new Employee("������", 2400);
		System.out.println(e3.toString());
	
	}

}


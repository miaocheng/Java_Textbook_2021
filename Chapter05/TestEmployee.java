
class Employee	{
	private double employeeSalary = 1800;
	
	public Employee()	{
		System.out.print("���췽�������� !");
	}
	
	public void getEmployeeSalary()	{
		System.out.println("ְԱ�Ļ���нˮΪ: " + employeeSalary);
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

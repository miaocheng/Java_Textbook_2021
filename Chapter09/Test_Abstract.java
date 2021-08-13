
import java.text.DecimalFormat;


public class Test_Abstract	{
	public static void main(String args [])	{
		Employee employeeRef;
		String output = "";
		Boss boss = new Boss("李晓华", 800.00);
		OrdinaryWorker worker = new OrdinaryWorker("张雪", 400.0, 3.0, 150);
		DecimalFormat precision = new DecimalFormat("0.00");
		
		employeeRef = boss;
		output += employeeRef.toString() + " 工资 " + 
			precision.format(employeeRef.getSalary()) + "\n" +
			boss.toString() + " 工资 " + precision.format(boss.getSalary()) + "\n";
		employeeRef = worker;
		
		output += employeeRef.toString() + " 工资 " +
			precision.format(employeeRef.getSalary()) + "\n" +
			worker.toString() + " 工资 " + precision.format(worker.getSalary()) + "\n";
		
		System.out.println(output);
	}
	
}

abstract class Employee		{
	private String name;
	private double mini_salary = 600;
	
	public Employee(String name)
	{
		this.name = name;
	}
	
	public String getEmployeeName()
	{
		return name;
	}
	
	public String toString()
	{
		return name;
	}
	
	public abstract double getSalary();
}


final class Boss extends Employee	{
	private double weeklySalary;
	
	public Boss(String name, double salary)
	{
		super(name);
		setWeeklySalary(salary);
	}
	
	public void setWeeklySalary(double s)	{
		weeklySalary = ( s > 0 ? s: 0);
	}
	
	public double getSalary()
	{
		return weeklySalary;
	}
	
	public String toString()	{
		return "经理: " + super.toString();
	}
}


final class OrdinaryWorker extends Employee	{
	private double salary;
	private double bonusfactor;
	private int quantity;
	
	OrdinaryWorker(String name, double salary, double bonusfactor, int quantity)
	{
		super(name);
		setSalary(salary);
		setBonusfactor(bonusfactor);
		setQuantity(quantity);
	}
	
	public void setSalary(double s)
	{
		salary = (s > 0? s: 0);
	}
	
	public void setBonusfactor(double c)
	{
		bonusfactor = (c > 0? c: 0);
	}
	
	public void setQuantity(int q)
	{
		quantity = (q > 0? q: 0);
	}
	
	public double getSalary()
	{
		return salary + bonusfactor * quantity;
	}
	
	public String toString()	{
		return "普通员工 :" + super.toString();
	}
	
}






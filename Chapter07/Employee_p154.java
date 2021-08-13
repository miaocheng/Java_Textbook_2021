
public class Employee_p154
{
	private long id;
	private String name;
	private int age;
	private boolean sex;
	private String phone;
	
	public Employee_p154(long id, String name, int age, boolean sex, String phone)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
	}
	
	public int getAge()	{
		return age;		
	}
	
	public String getSex()	{
		if (sex)
			return "Å®";
		
		return "ÄÐ";
	}
	
	public String getPhone()	{
		return phone;
	}
	
	public static void main(String [] args)	{
		Employee_p154 emplyee = new Employee_p154(1, "ÕÅÈý", 18, false, "65534568");
		
		System.out.println(emplyee.getAge());
		System.out.println(emplyee.getSex());
		System.out.println(emplyee.getPhone());
	}
	
}



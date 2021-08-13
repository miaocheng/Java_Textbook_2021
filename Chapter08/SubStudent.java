

class Person	{
	private String name;
	private int age;
	
	public void initInfo(String s, int i)	{
		name = s;
		age = i;
	}
	
	public void showInfo()	{
		System.out.println("尊敬的 " + name + " ，您的年龄为：" + age);
	}
}


public class SubStudent extends Person	{
	private String school;
	private int engScore;
	private int JavaScore;
	
	public void setScores(String s, int e, int j)	{
		school = s;
		engScore = e;
		JavaScore = j;		
	}
	
	public static void main(String [] args)	{
		SubStudent objStudent = new SubStudent();
		objStudent.initInfo("王烁", 22);
		objStudent.showInfo();
		objStudent.setScores("清华大学", 85, 91);
	}
	
	
}



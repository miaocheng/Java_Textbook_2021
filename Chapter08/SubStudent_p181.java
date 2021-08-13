
class Person	{
	protected String name;
	protected int age;
	public void initInfo(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public void showInfo()	{
		System.out.println("尊敬的" + name + " , 您的年龄为: " + age);	
	}
	
}


public class SubStudent_p181 extends Person	{
	private String school;
	private int engScore;
	private int JavaScore;
	
	public void showInfo()	{
		System.out.println(school + "的" + name + "同学" + " 年龄为:" + age + " 英语成绩是: " + engScore + 
		", 你的成绩是: " + JavaScore);
	}
	
	public void setScores(String s, int e, int j)	{
		school = s;
		engScore = e;
		JavaScore = j;
	}
	
	public static void main(String [] args)	{
		SubStudent objStudent = new SubStudent();
		objStudent.initInfo("王烁", 22);
		objStudent.setScores("江南大学", 79, 92);
		objStudent.showInfo();
	}
	
}


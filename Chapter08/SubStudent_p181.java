
class Person	{
	protected String name;
	protected int age;
	public void initInfo(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public void showInfo()	{
		System.out.println("�𾴵�" + name + " , ��������Ϊ: " + age);	
	}
	
}


public class SubStudent_p181 extends Person	{
	private String school;
	private int engScore;
	private int JavaScore;
	
	public void showInfo()	{
		System.out.println(school + "��" + name + "ͬѧ" + " ����Ϊ:" + age + " Ӣ��ɼ���: " + engScore + 
		", ��ĳɼ���: " + JavaScore);
	}
	
	public void setScores(String s, int e, int j)	{
		school = s;
		engScore = e;
		JavaScore = j;
	}
	
	public static void main(String [] args)	{
		SubStudent objStudent = new SubStudent();
		objStudent.initInfo("��˸", 22);
		objStudent.setScores("���ϴ�ѧ", 79, 92);
		objStudent.showInfo();
	}
	
}


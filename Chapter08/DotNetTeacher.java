
package DotNetTeacher;

public class DotNetTeacher	{
	private String name;
	private String school;
	public DotNetTeacher(String myName, String mySchool)	{
		name = myName;
		school = mySchool;
	}
	
	public void giveLession()	{
		System.out.println("����VS2016");
		System.out.println("֪ʶ�㽲��");
		System.out.println("�ܽ�����");
	}
	
	public void introduction()	{
		System.out.println("��Һ�! ����" + school + "��" + name + ".");
	}
	
}


public class JavaTeacher	{
	private String name;
	private String school;
	
	public JavaTeacher(String myName, String mySchool)	{
		name = myName;
		school = mySchool;
	}
	
	public void giveLesson()	{
		System.out.println("����MyEclipse");
		System.out.println("֪ʶ�㽲��");
		System.out.println("�ܽ�����");
	}
	
	public void introduction()	{
		System.out.println("��Һ�!����" + school + "��" + name + ".");
	}
	
}




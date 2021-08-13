
import DotNetTeacher.*;

public class Teacher	{
	private String name;
	private String school;
	public Teacher(String myName, String mySchool)	{
		name = myName;
		school = mySchool;
	}
	
	public void giveLesson()	{
		System.out.println("֪ʶ�㽲��");
		System.out.println("�ܽ�����");
	}
	
	public void introduction()	{
		System.out.println("��Һ�! ����" + school + "��" + name + "��");
	}
	
}

public class JavaTeacher extends Teacher	{
	public JavaTeacher(String myName, String mySchool)	{
		super(myName, mySchool);
	}
	
	public void giveLesson()	{
		System.out.println("���� MyEclipse");
		super.giveLesson();
	}
	
}

public class Test_Teacher	{
	public static void main(String args [])		{
		JavaTeacher javaTeacher = new JavaTeacher("��ΰ", "���ϴ�ѧ");
		
		javaTeacher.giveLesson();
		javaTeacher.introduction();
		System.out.println("\n");
		DotNetTeacher dotNetTeacher = new DotNetTeacher("����", "���ϴ�ѧ");
		dotNetTeacher.giveLesson();
		dotNetTeacher.introduction();
	}
	
}



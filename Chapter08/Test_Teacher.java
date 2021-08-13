
import DotNetTeacher.*;

public class Teacher	{
	private String name;
	private String school;
	public Teacher(String myName, String mySchool)	{
		name = myName;
		school = mySchool;
	}
	
	public void giveLesson()	{
		System.out.println("知识点讲解");
		System.out.println("总结提问");
	}
	
	public void introduction()	{
		System.out.println("大家好! 我是" + school + "的" + name + "。");
	}
	
}

public class JavaTeacher extends Teacher	{
	public JavaTeacher(String myName, String mySchool)	{
		super(myName, mySchool);
	}
	
	public void giveLesson()	{
		System.out.println("启动 MyEclipse");
		super.giveLesson();
	}
	
}

public class Test_Teacher	{
	public static void main(String args [])		{
		JavaTeacher javaTeacher = new JavaTeacher("张伟", "江南大学");
		
		javaTeacher.giveLesson();
		javaTeacher.introduction();
		System.out.println("\n");
		DotNetTeacher dotNetTeacher = new DotNetTeacher("李涛", "江南大学");
		dotNetTeacher.giveLesson();
		dotNetTeacher.introduction();
	}
	
}



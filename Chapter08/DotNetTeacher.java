
package DotNetTeacher;

public class DotNetTeacher	{
	private String name;
	private String school;
	public DotNetTeacher(String myName, String mySchool)	{
		name = myName;
		school = mySchool;
	}
	
	public void giveLession()	{
		System.out.println("启动VS2016");
		System.out.println("知识点讲解");
		System.out.println("总结提问");
	}
	
	public void introduction()	{
		System.out.println("大家好! 我是" + school + "的" + name + ".");
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
		System.out.println("启动MyEclipse");
		System.out.println("知识点讲解");
		System.out.println("总结提问");
	}
	
	public void introduction()	{
		System.out.println("大家好!我是" + school + "的" + name + ".");
	}
	
}




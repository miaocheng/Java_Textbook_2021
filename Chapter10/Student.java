

public class Student    {
    public static int validate(String initAge) throws Exception {
        int age = Integer.parseInt(initAge);
        if (age < 0)
            throw new Exception("年龄不能为负数 !");
		
        return age;
    }
	
    public static void main(String [] args) {
        try {
            int yourAge = validate("- 30");
            System.out.println(yourAge);
        }catch(Exception e) {
            System.out.println("发生了逻辑错误 !");
            System.out.println("原因: " + e.getMessage());
        }
    }

}



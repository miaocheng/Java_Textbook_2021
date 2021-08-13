
public class Person {
    String name;
    int age;
    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String toString()    {
        return "姓名是" + name + "，年龄是" + age + "岁";
    }
}

class PersonDemo    {
    public static void main(String [] args) {
        Person p = new Person("王琳", 26);
        System.out.println(p);
    }
}



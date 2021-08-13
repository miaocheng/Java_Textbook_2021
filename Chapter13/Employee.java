
public class Employee implements java.io.Serializable   {
    public String name, address;
    public transient int SSN;
    public int number;
    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}


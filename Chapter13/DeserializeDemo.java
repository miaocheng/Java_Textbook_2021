
import java.io.*;

public class DeserializeDemo     {
    public static void main(String [] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException i)
        {
            i.printStackTrace();
            return;
        }

        catch (ClassNotFoundException c)    {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        } System.out.print("Deserialized Employee ...");

        System.out.print("Name: " + e.name);
        System.out.print(", Address: " + e.address);
        System.out.print(", SSN: " + e.SSN);
        System.out.println(", Number: " + e.number);
    }

}



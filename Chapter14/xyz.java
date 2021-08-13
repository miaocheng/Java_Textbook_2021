
public class ThreadTest {
    public static void main(String [] args) {
        xyz r = new xyz();
        Thread t = new Thread(r);
        t.start();
    }
}

class xyz implements Runnable   {
    int i;
    public void run()   {
        while (true)
        {
            System.out.println("Hello" + i++);
            if (i == 5)
                break;
        }
    }

}



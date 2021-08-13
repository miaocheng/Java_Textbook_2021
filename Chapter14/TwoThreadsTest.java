
class SimpleThread_p321 extends Thread   {
    public SimpleThread_p321(String str)     {
        super(str);
    }

    public void run()   {
        for (int i = 0; i < 10; i++)    {
            System.out.println(i + " " + getName());
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e)
            { }
        }
        System.out.println("DONE !" + getName());
    }
}

public class TwoThreadsTest {
    public static void main(String [] args) {
        new SimpleThread("First").start();
        new SimpleThread("Second").start();
    }

}



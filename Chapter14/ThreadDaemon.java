
import java.io.*;

class MyThread extends Thread   {
    public void run()   {
        for (int i = 0; i < 100; i++)   {
            System.out.println("NO. " + i + "Daemon is " + isDaemon());

            try {
                sleep(1);
            } catch (InterruptedException e)    { }
        }
    }
}

public class ThreadDaemon   {
    public static void main(String [] args) throws IOException  {
        System.out.println("Thread's daemon status, yes(Y) or no(N): ");
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String str = stdin.readLine();

        if (str.equals("yes") || str.equals("Y"))   {
            MyThread t = new MyThread();
            t.setDaemon(true);
            t.start();
        }
        else
            new MyThread().start();
    }
}



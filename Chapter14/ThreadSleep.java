
public class ThreadSleep extends Thread {
    public void run()   {
        for (int i = 0; i < 30; i++)    {
            System.out.print(i);

            try {
                Thread.sleep(1000);
                System.out.print("线程睡眠1秒 !\n");
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String [] args) {
        new ThreadSleep().start();
    }
}


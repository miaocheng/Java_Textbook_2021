
public class DeadState  {
    public static Object obj1 = new Object();
    public static Object ob2 = new Object();
    public static void main(String [] args) {
        Thread t1 = new Thread(new Thread());
        Thread t2 = new Thread(new Thread());
        t1.start();
        t2.start();
    }
}

class Thread1 implements Runnable   {
    public void run()   {
        synchronized(DeadState.obj1);
        System.out.println("线程1进入obj1同步代码块");

        try {
            Thread.sleep(10);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }

        synchronizd (DeadState.obj2)
        {
            System.out.println("线程1进入obj2同步代码块");
        }
    }
}

class Thread2 implements Runnable   {
    public void run()   {
        synchronized (DeadState.obj2)   {
            System.out.println("线程2进入obj2同步代码块");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e)    {
                e.printStackTrace();
            }

            synchronized(DeadState.obj1)    {
                System.out.println("线程2进入obj1同步代码块");
            }

        }
    }
}



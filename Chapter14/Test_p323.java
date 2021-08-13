
class SimpleThread_p323 implements Runnable  {
    public void run()   {
        for (int i = 0; i < 5; i++)     {
            System.out.print(Thread.currentThread().getName() + "阶段" + i + "->");
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch(InterruptedException e) {}
        }

        System.out.print(Thread.currentThread().getName() + "线程结束了 !");
    }
}

public class Test_p323  {
    public static void main(String [] args) {
        new Thread(new SimpleThread(), "First").start();
        new Thread(new SimpleThread(), "Second").start();
    }

}



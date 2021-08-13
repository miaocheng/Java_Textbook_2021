
class NewThread extends Thread  {
    NewThread() {
        super("线程 Demo");
        System.out.print("/子线程名： " + this);
        start();
    }

    public void run()   {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.print("/子线程阶段: " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e)
        {
            System.out.print("/Child interrupted.");
        }

        System.out.println("/子线程退出。");
    }
}

public class Test_p322   {
    public static void main(String args []) {
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.print("/主线程阶段: " + i);
                Thread.sleep(100);
            }
        } catch(InterruptedException e)
        {
            System.out.print("/主线程中断。");
        }

        System.out.print("/主线程退出。");
    }
}



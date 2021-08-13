
public class ThreadJoin implements Runnable {
    public static int result = 1;
    int n;
    public ThreadJoin(int n)    {
        this.n = n;
    }

    public void run()   {
        for (int k = 1; k <= n; k++)    {
            result = result * k;
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) { }
        }
    }

    public static void main(String [] args) throws Exception {
        int n = new Integer(args[0]).intValue();
        ThreadJoin th = new ThreadJoin(n);
        Thread t = new Thread(th);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e)    { }

        System.out.println(n + "的阶乘为： " + result);
    }

}



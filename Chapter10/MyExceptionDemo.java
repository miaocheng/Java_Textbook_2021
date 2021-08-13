
import java.lang.Throwable;

public class MyExceptionDemo {
    public static void main(String [] args) {
        MyExceptionDemo med = new MyExceptionDemo();
        try {
            med.getScore(105);
        } catch(TooHigh e)   {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch(TooLow e)   {
            e.printStackTrace();
            System.out.println(e.getMessage() + " core is: " + e.score);
        }
    }

    public void getScore(int x) throws TooHigh, TooLow  {
        if (x > 100)    {
            TooHigh e = new TooHigh("score > 100", x);
            throw e;
        }
        else if (x < 0) {
            TooLow e = new TooLow("score < 0", x);
            throw e;
        }
        else
            System.out.println("score is :" + x);
    }

}




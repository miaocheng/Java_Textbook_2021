
class ShareData {
    private char c;
    private boolean writeable = true;

    public synchronized void setShareChar(char c)   {
        if (! writeable) try    {
            wait();
        } catch (InterruptedException e)    { }

        this.c = c;
        writeable = false;
        notify();
    }

    public synchronized char getShareChar() {
        if (writeable)
            try {
                wait();
            } catch(InterruptedException e) { }

        writeable = true;
            notify();

        return this.c;
    }

}

class Producer extends Thread   {
    private ShareData s;
    Producer(ShareData s)   {
        this.s = s;
    }

    public void run()   {
        for (char ch = 'A'; ch <= 'Z'; ch++)    {
            try {
                Thread.sleep((int) Math.random() * 400);
            }
            catch (InterruptedException e)  { }

            s.setShareChar(ch);
            System.out.println(ch + " producer by producer.");
        }
    }
}

class Consumer extends Thread   {
    private ShareData s;
    Consumer(ShareData s)   {
        this.s = s;
    }

    public void run()   {
        char ch;
        do {
            try {
                Thread.sleep((int) Math.random() * 400);
            }
            catch(InterruptedException e)   { }

            ch = s.getShareChar();
            System.out.println(ch + " consumer by consumer. **");
        } while (ch != 'Z');
    }
}

public class ProducerConsumer   {
    public static void main(String [] args) {
        ShareData s = new ShareData();
        new Consumer(s).start();
        new Producer(s).start();
    }

}



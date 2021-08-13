
interface PCI   {
    void start();
    void stop();
}

class SoundCard implements PCI  {
    public void start(){
        System.out.print("Start, Du du du ......");
    }

    public void stop() {
        System.out.println("Sound stop !");
    }
}

class NetworkCard implements PCI    {
    public void start() {
        System.out.print("Start, send ......");
    }

    public void stop()  {
        System.out.println("Network stop !");
    }
}

class MainBoard {
    public void usePCICard(PCI p)   {
        p.start();
        p.stop();
    }
}

public class Assembler {
    public static void main(String args []) {
        PCI nc = new NetworkCard();
        PCI sc = new SoundCard();
        MainBoard mb = new MainBoard();
        mb.usePCICard(nc);
        mb.usePCICard(sc);
    }
}



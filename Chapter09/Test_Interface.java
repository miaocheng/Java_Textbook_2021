
interface Animal    {
    void run();
    void breathe();
}

class Fish implements Animal {
    public void run() {
        System.out.print("鱼可以在水中游动。 ");
    }

    public void breathe() {
        System.out.print("鱼可以在水中呼吸。");
    }
}

abstract class LandAnimal implements Animal {
    public void breathe()   {
        System.out.print("陆地动物可以呼吸。");
    }
}

class Tiger extends LandAnimal{
    public void run()   {
        System.out.print("老虎是陆地动物，可以奔跑。");
    }

    public void breathe() {
        System.out.print("老虎是陆地动物，可以呼吸。");
    }
}

public class Test_Interface {
    public static void main(String args []) {
        Animal an1 = new Fish();
        an1.run();
        an1.breathe();
        Animal an2 = new Tiger();
        an2.run();
        an2.breathe();
    }

}



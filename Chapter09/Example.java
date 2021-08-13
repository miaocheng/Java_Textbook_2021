
abstract class Animal   {
    public abstract void cry();
}

class TestCry   {
    public void testCry(Animal animal)  {
        animal.cry();
    }
}

public class Example {
    public static void main(String [] args) {
        TestCry cry = new TestCry();
        cry.testCry(new Animal()    {
            public void cry()  {
                System.out.print("Cat is crying !");
            }
        });

        cry.testCry(new Animal()    {
            public void cry()   {
                System.out.print("Dog is crying !");
            }
        });

    }
}



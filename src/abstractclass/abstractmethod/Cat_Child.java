package abstractclass.abstractmethod;

public class Cat_Child extends Animal_Abstract{
    @Override
    public void run() {
        System.out.println("cat run fast");
    }

    @Override
    public boolean swim() {
        return false;
    }
}

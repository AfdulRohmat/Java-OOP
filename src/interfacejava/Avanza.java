package interfacejava;

public class Avanza implements Car{
    @Override
    public void drive() {
        System.out.println("drive Avanza");
    }

    @Override
    public int getTire() {
        return 4;
    }
}

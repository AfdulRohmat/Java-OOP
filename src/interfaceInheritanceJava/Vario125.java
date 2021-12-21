package interfaceInheritanceJava;

public class Vario125 implements Motor,ElectricMotor,isMaintenance {

    @Override
    public int getHarga() {
        return 19_000_000;
    }

    @Override
    public String getBrand() {
        return "Honda Vario 125";
    }

    @Override
    public boolean isMaintenance() {
        return true;
    }

    @Override
    public boolean isMatic() {
        return Motor.super.isMatic();
    }
}

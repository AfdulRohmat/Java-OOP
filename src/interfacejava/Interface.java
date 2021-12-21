package interfacejava;

public class Interface {
    /*
        Interface mirip dengan abstract class.

        Idealnya jika ingin membuat contract memakai interface,
        bukan abstract class

        Perbedaannya adalah di interface, semua method otomatis
        abstract, tidak memiliki block

        Di Interface tidak boleh memiliki field, hanya boleh
        memiliki constant (field yang tidak bisa dirubah)

        Untuk membuat interface memakai keyword interface

        Untuk mewariskan (inheritance) interface, memakai
        keyword implements
     */

    /*
        public interface NamaCLass{}
     */
    public static void main(String[] args) {
        Car avanza = new Avanza();
        avanza.drive();
        System.out.println(avanza.getTire());
    }
}
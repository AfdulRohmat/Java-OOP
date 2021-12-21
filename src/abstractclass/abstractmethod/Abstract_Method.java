package abstractclass.abstractmethod;

public class Abstract_Method {
    /*
        saat membuat class abstract, bisa juga membuat abstract
        method di dalamnya

        saat membuat abstract method, tidak boleh membuat blok
        method untuk abstract method tersebut

        abstract method wajib di override di child classnya

        keyword:
            public abstract void/kembalian namaMethod();
     */

    public static void main(String[] args) {
        Animal_Abstract kucing = new Cat_Child();
        kucing.name = "Kucing";
        kucing.run();
        kucing.swim();
    }
}

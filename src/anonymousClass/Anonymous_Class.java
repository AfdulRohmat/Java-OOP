package anonymousClass;

public class Anonymous_Class {
    /*
        1. Anonymous class adalah class tanpa nama
        2. Adalah kemampuan mendeklarasikan class, sekaligus
           meng-instansiasi object-nya secara langsung
        3. Anonymous class sebenarnya termasuk inner class,
           dimana outer class nya adalah tempat dimana kita
           membuat anonymous class tersebut
        4. Anonymous class sangat cocok ketika kita berhadapan
           dengan kasus membuat implementasi interface atau
           abstract class sederhana, tanpa harus membuat
           implementasi class nya
     */
    public static void main(String[] args) {
        // code anonymous class
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello guys");
            }

            @Override
            public void sayHello(String saySomething_param) {
                System.out.println(saySomething_param+" "+"semoga harimu menyenangkan");
            }
        };

        english.sayHello();
        english.sayHello("Haii...");


    }
}

public class Method {
    /*
        1. Method adalah tindakan apapun yang bisa dilakukan
           di dalam class.
        2. Method pada dasarnya adalah function yang berada
           di dalam class.
     */

    void StringmatikanLampu(){
        // ... do something here
        System.out.println("Mematikan lampu");
    }


    public static void main(String[] args) {
        Lampu lampu = new Lampu();

        lampu.menyalakanLampu();
    }
}


class Lampu{

    void menyalakanLampu(){
        System.out.println("Lampu menyala");
    }
}
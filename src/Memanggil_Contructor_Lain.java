public class Memanggil_Contructor_Lain {
    /*
        1. Constructor bisa memanggil constructor lain
        2. bisa memudahkan saat butuh menginisialisasi data dengan
           berbagai kemungkinan
        3. cara memanggil contructor lain seperi memanggil method
           tapi dengan keyword 'this'.
     */
    public static void main(String[] args) {
        Person person1 = new Person("Akbar", "Kediri");

    }
}

class Person{
    String nama;
    String alamat;
    final String asal = "Indonesia";

    Person(String nama_param, String alamat_param){
        nama = nama_param;
        alamat = alamat_param;
    }

    Person(String nama_param2){
        this(nama_param2, null);
    }

    Person(){
        this(null);
    }
}

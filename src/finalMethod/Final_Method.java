package finalMethod;

public class Final_Method {
    /*
        1.  Kata kunci final juga bisa digunakan di Method
        2.  Jika sebuah method kita tambahkan kata kunci
            final, maka artinya method tersebut tidak bisa
            di override lagi di class child nya
        3.  Ini sangat cocok jika kita ingin mengunci
            implementasi dari sebuah method agar tidak bisa
            diubah lagi oleh class child nya
     */
    public static void main(String[] args) {

    }
}

class SosialMedia{
    String name;

    //keyword final di method
    final void login(String username_param, String password_param){
        // ...
    }
}

class Instagram extends SosialMedia{
    /*void login(String username_param, String password_param){
        // ...
    }
     */ // error
}

package finalClass;

public class Final_Class {
    /*
        1. keyword Final bisa digunakan di class, dimana jika kita
           menggunakan kata kunci final sebelum class, maka kita
           menandakan bahwa class tersebut tidak bisa diwariskan
           lagi
        2. Secara otomatis semua class child nya akan error
     */
    public static void main(String[] args) {

    }
}

class MetaVerse{
    String name;
}

// keyword final class
final class Facebook extends MetaVerse{
    //....
}

// Error
/*class FacebookLite extends Facebook{
    //....
}
 */

package recordClass;

/*
    Kadang kita sering membuat class, hanya untuk class yang
    berisikan data. Hanya berisi getter, equals, hashCode,
    dan toString method

    Record class digunakan untuk mempermudah pembuatan jenis
    class tersebut

    Saat kita membuat record class, secara otomatis Java akan
    membuatkan getter, equals, hashCode dan toString method
    secara otomatis, dan juga constructor secara otomatis

    Saat membuat record class, secara otomatis kita akan
    meng-extends class java.lang.Record, yang artinya kita
    tidak bisa extends class lain. Namun kita tetap bisa
    meng-implement interface

 */

public record Login_Request(String username, String password) {

    /* Membuat Constructor di record class tidak membutuhkan
       tanda ()
     */
    public Login_Request{
        System.out.println("ini constructor record class");
    }

    /*
       juga bisa melakukan constructor overloading, namun
       ada syaratnya, yaitu constructor overloading nya
       harus tetap memanggil constructor utama yang secara
       otomatis dibuatkan di record class
     */
    public Login_Request(String username){
        this("eko", "");
    }

    public Login_Request(){
        this("","");
    }
}

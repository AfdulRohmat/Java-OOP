package interfaceInheritanceJava;

public interface Motor {
    String getBrand();


    //Default Method()
    /*
        Digunakan untuk menambahkan konkrit method di interface
        sehingga class turunan tidak wajib mengoverride method
        ini
     */
    default boolean isMatic(){
        return true;
    }
}

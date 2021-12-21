public class Polymorphism {
    /*
        1. Polymorphism artinya banyak bentuk
        2. dalam OOP, Polymorphism adalah kemampuan object
           berubah bentuk menjadi bentuk lain
        3. Polymorphism punya hubungan erat dengan Inheritance
     */

    public static void main(String[] args) {
        //Contoh Polymorphism
        Karyawan karyawan = new Karyawan("EKa");
        karyawan.sayHai();

        karyawan = new Programmer("Budi");
        karyawan.sayHai();
    }
}

class Karyawan{
    String nama;
    Karyawan(String nama_param){
        this.nama = nama_param;
    }
    void sayHai(){
        System.out.println("nama: "+nama);
    }
}

class Programmer extends Karyawan{
    Programmer(String nama_param) {
        super(nama_param);
    }

}


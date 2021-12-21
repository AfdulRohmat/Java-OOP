public class Inheritance {
    /*
        Inheritance / Pewarisan adalah konsep OOP dimana sebuah
        class dapat menurunkan property dan method yang dimilikinya
        kepada class lain. Konsep inheritance dipakai untuk
        memanfaatkan fitur code reuse, yakni menghindari terjadinya
        duplikasi kode program.
     */

    /*
        Kelas yang akan diturunkan disebuh parent class,
        super class, base class

        kelas yang menerima penurunan disebut child class,
        sub class, derived class, heir class

        1 parent bisa punya banyak child.
        1 child hanya boleh punya 1 parent.
     */

    /*
        keyword : class_child class extends parent_class{}
     */
    public static void main(String[] args) {
        KucingKampung meaw = new KucingKampung("Kucing kampung", "ras kampung");
        meaw.keterangan();
        meaw.keteranganParent();

    }
}

class Kucing{
    String jenisKucing;
    String ras;
    final int jumlah_kaki = 4;

    void keteranganParent(){
        System.out.println("Ini method class parent");
    }
}

/*
    dengan keyword extends, sekarang class KucingKampung bisa
    mengakses semua field dan method dari class Kucing sebagai
    parentnya
 */
class KucingKampung extends Kucing{

    KucingKampung(String jenisParam, String rasParam){
        this.jenisKucing = jenisParam;
        this.ras = rasParam;
    }

    void keterangan(){
        System.out.println("jenis kucing: "+jenisKucing);
        System.out.println("ras: "+ras);
        System.out.println("jumlah kaki: "+jumlah_kaki);
    }
}

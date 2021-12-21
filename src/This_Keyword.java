public class This_Keyword {
    /*
        1. Kata kunci this bisa dipakai untuk mengakses object saat
           ini
        2. saat kita butuh mengakses field/properti yang namanya sama
           dengan nama paramter method, untuk menghindari variable
           shadowing bisa memakai keyword this ii.
        3. keyword this juga bisa dipakai untuk mengakses method
        4. bisa dipakai untuk mengatasi masalah variable shadowing
     */

    public static void main(String[] args) {
        Mobil daihatsu_Xenia = new Mobil("daihatu xenia", 120_000_000);
        daihatsu_Xenia.keterangan();

    }
}

class Mobil{
    String merk;
    int harga;

    Mobil(String merk, int harga){
        this.merk = merk;
        this.harga = harga;
    }

    void keterangan(){
        System.out.println("merek mobil: "+merk);
        System.out.println("harga: "+harga);
    }
}

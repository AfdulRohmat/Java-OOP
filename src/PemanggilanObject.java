public class PemanggilanObject {
    /*
        1. Proses mencetak object dari class ini disebut
           dengan instansiasi (atau instantiation).
        2. proses instansiasi dilakukan dengan menulis nama
           class, lalu diikuti nama variabel yang akan
           menampung object tersebut, tanda sama dengan “=”,
           keyword new dan kembali nama class dengan
           tambahan tanda kurung “()”.

           ==>
           NamaClass namaObject = new NamaClass();

     */

    public static void main(String[] args) {
        Sepeda sepeda_poligon = new Sepeda();

        sepeda_poligon.merek = "Poligon";
        sepeda_poligon.jumlah_roda = 2;
        sepeda_poligon.ukuran = 27;
        sepeda_poligon.akselerasi();
        sepeda_poligon.mengerem();
    }
}


class Sepeda{
    String merek;
    int jumlah_roda;
    int ukuran;

    void akselerasi(){
        System.out.println("sepeda bisa sangat cepat");
    }

    void mengerem(){
        System.out.println("Sepeda mengerem");
    }
}
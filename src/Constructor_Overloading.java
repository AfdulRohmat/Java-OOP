public class Constructor_Overloading {
    /*
        Constructor di java mirip dengan method. Artinya bisa
        melakukak overloading / membuat constructor lebih
        dari 1.

        Syaratnya tipe data parameter harus berbeda atau
        jumlah parameternya harus berbeda
     */
    public static void main(String[] args) {
        Buah mangga = new Buah("mangga", 2, 20_000);
        mangga.keteranganBuah();

        System.out.println(" ");

        Buah nanas = new Buah("nanas", 5, 12_000, "Manis sekali");
        nanas.keteranganBuah();

    }
}

class Buah{
    String namaBuah;
    double berat;
    int harga;

    Buah(String namaBuah_param, double berat_param, int harga_param){
        namaBuah = namaBuah_param;
        berat = berat_param;
        harga = harga_param;
    }

    //Constructor overloading
    Buah(String jenisBuah_param, double berat_param, int harga_param, String keterangan_param){
        namaBuah = jenisBuah_param;
        berat = berat_param;
        harga = harga_param;

        String iklan = keterangan_param;

        System.out.println("Iklan: "+ iklan);
    }

    void keteranganBuah(){
        System.out.println("nama buah: "+namaBuah);
        System.out.println("beratnya: "+berat);
        System.out.println("harganya : Rp. "+harga);
    }
}
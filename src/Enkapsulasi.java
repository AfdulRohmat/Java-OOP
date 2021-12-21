public class Enkapsulasi {
    /*
        Encapsulation adalah memastikan data sensisitif di
        sebuah object tersembunyi dari akses luar dengan
        tujuan agar data dari object ini tetap aman dan valid

        Untuk membuat Encapsulation ini dengan membuat semua
        access modifier filed di class sebagai private

        Untuk mengakses dan mengubah field private ini,
        dibuat method getter dan setter
     */

    /*
        Getter -> method untuk mengambil data di field yang
                  private (read only)
        Setter -> method untuk mengubah data di field

        Tipe data boolean   Getter Method   Setter Method
        1. boolean          isXxx           setXxxx(bolean value)
        2. primitif         getXxx          setXxxx(bolean value)
        3. Object           getXxx          setXxxx(bolean value)
     */

    public static void main(String[] args) {
        Book bukuPulang = new Book();
        bukuPulang.setJudul("Pulang - Tere Liye");
        System.out.println("Judul buku: "+bukuPulang.getJudul());

        bukuPulang.setJumlah_halaman(548);
        System.out.println("jumlah halaman: "+bukuPulang.getJumlah_halaman());

        bukuPulang.setMahal(false);
        System.out.println("Apakah mahal : "+bukuPulang.isMahal());

    }
}

class Book{
    private String judul;
    private int jumlah_halaman;
    boolean mahal;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getJumlah_halaman() {
        return jumlah_halaman;
    }

    public void setJumlah_halaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }

    public boolean isMahal() {
        return mahal;
    }

    public void setMahal(boolean mahal) {
        this.mahal = mahal;
    }
}

public class Equals_Method {
    /*
        1. Di bahasa pemrograman lain, untuk mengecek apakah
           sebuah object sama, biasanya menggunakan operator
           ==, di Java, operator == hanya untuk mengecek data
           primitif
        2. Untuk non primitif pengecekan nya menggunakan
           method equals
        3. Dan secara default, method equals itu akan
           membandingkan dua buah object secara kesamaan
           posisi object di memory, artinya jika kita
           membuat 2 object yang isi fields nya sama,
           tetap dianggap beda oleh method equals
     */
    public static void main(String[] args) {


        String first = "Eko";
        first += " " + "Kurniawan";
        System.out.println(first);

        String second = "Eko Kurniawan";

        System.out.println(first == second); // false

        //Equal method => membandingkan isi
        System.out.println(first.equals(second)); //true
    }
}

package staticKeyword;

public class Static_Keyword {
    /*
        1. dengan keyword static, kita bisa membuat field,
           method atau class bisa diakses langsung tanpa
           melalui object nya
        2. static hanya bisa mengakses static lainnya
     */

    /*
        Static dapat digunakan di
        1. Field/properties => disebut class variable,
           artinya field tersebut bisa diakses langsung
           tanpa membuat object terlebih dahulu

        2. Method => disebut class method, artinya method
           tersebut bisa diakses langsung tanpa membuat
           object terlebih dahulu

        3. Block => tatic block akan otomatis dieksekusi
           ketika sebuah class di load

        4. Inner Class => Inner class tersebut bisa diakses
           secara langsung tanpa harus membuat object outer
           class  terlebih dahulu. Static pada inner class
           menyebabkan kita tidak bisa mengakses lagi object
           outer class nya
     */
    public static void main(String[] args) {
        // Memanggil static members
        System.out.println(Static_Field.name);
        System.out.println(Static_Method.sum(2, 4));

        Negara.Provinsi provinsi = new Negara.Provinsi();
        provinsi.setNamaProvinsi("Jawa Timur");

        System.out.println(Application.PROCESSOR);

    }
}

// Static Field
 class Static_Field{

    public static String name;
    public static int age;
}

// Static Method
class Static_Method{

    public static int sum(int... values){
        int total = 0;
        for (var value:values){
            total += value;
        }

        return total;
    }
}

// Static Inner Class
class Negara{
    private String bendera;

    public String getBendera() {
        return bendera;
    }

    public void setBendera(String bendera) {
        this.bendera = bendera;
    }

    public static class Provinsi{
        private String namaProvinsi;

        public String getNamaProvinsi() {
            return namaProvinsi;
        }

        public void setNamaProvinsi(String namaProvinsi) {
            this.namaProvinsi = namaProvinsi;
        }
    }
}

// Static Block
class Application{
    public static final int PROCESSOR;

    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}

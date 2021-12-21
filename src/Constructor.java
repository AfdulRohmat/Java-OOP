public class Constructor {
    /*
        Constructor adalah method khusus yang dijalankan
        secara otomatis pada saat sebuah object dibuat,
        yakni saat proses instansiasi.

        nama Constructor harus sama dengan nama class.
     */

    public static void main(String[] args) {
        Sapi sapiBrahma = new Sapi(4, "moooo", 90);
        sapiBrahma.sapiBisaApa();

    }
}

class Sapi{
    int kaki;
    String suara;
    double bobot;

    //Constructor
    Sapi(int kaki_param, String suara_param, double bobot_param){
       kaki = kaki_param;
       suara = suara_param;
       bobot = bobot_param;
    }

    void sapiBisaApa(){
        System.out.println("Sapi berjala dengan "+kaki+" kaki");
        System.out.println("Suara sapi = "+suara);
        System.out.println("Bobot sapi = "+bobot+" kg.");
    }

}


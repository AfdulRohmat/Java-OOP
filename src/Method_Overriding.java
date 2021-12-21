public class Method_Overriding {
    /*
        kemampuan mendeklarasikan ulang method di child class
        yang sebelumnya sudah ada di parent

        saat melakukan overriding maka otomatis ketika membuat
        object dari class child, method di class parent tidak
        bisa diakses lagi karena sudah tertumpuk
     */
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        supervisor.cekInfo();
    }
}

class Manager {
    void cekInfo() {
        System.out.println("Ini berasal dari class Manager");
    }
}

class Supervisor extends Manager {

    void cekInfo() {
        System.out.println("Ini berasal dari class supervisor");
    }
}



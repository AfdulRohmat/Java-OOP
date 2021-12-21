package innerClass;

public class InnerCLass {
    /*
        1.  Di Java, kita bisa membuat class di dalam class,
            atau disebut dengan Inner Class
        2.  Contoh penggunaan dari inner clas biasanya ketika
            butuh membuat beberapa class yang saling
            berhubungan, dimana sebuah class tidak bisa dibuat
            tanpa class lain
        3.  Misal kita perlu membuat class Employee, dimana
            membutuhkan class Company, maka kita bisa membuat
            class Employee sebagai inner class Company
        4.  Cara membuat inner class, cukup membuatnya
            di dalam blok class outer class nya
     */

    public static void main(String[] args) {
        Company company = new Company();
        company.setCompanyName("PT Rokok Surya");

        // akses object inner class
        Company.Employe employe = company.new Employe();
        employe.setEmployeName("Agus");
        employe.getCompany();

    }
}

class Company{
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //inner class
    public class Employe{
        private String employeName;

        public String getEmployeName() {
            return employeName;
        }

        public void setEmployeName(String employeName) {
            this.employeName = employeName;
        }

        /* Keunggulan inner class bias akses private field di
           outer classnya
         */
        public String getCompany(){
            return Company.this.getCompanyName();
        }
    }
}

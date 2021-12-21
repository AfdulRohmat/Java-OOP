package enumClass;

public class EnumCLass {
    /*
       Saat kita membuat aplikasi, kadang kita akan bertemu
       dengan jenis-jenis data yang nilainya terbatas

       Misal, gender, ada male dan female, atau tipe customer,
       ada standard, premium atau vip, dan lain-lain

       Dalam kasus seperti ini, kita bisa menggunakan
       enum class, yaitu class yang berisikan nilai terbatas
       yang sudah ditentukan

       Saat membuat enum class, secara otomatis dia akan
       meng-extends class java.lang.Enum, oleh karena itu
       class enum tidak bisa extends class lain, namun masih
       tetap bisa implements interface.

     */
    public static void main(String[] args) {
        // membuat object enum
        Customer customer = new Customer();
        GenreCustomer genreCustomer = new GenreCustomer();

        customer.setCustomerName("Afdul");
        // mendefinisikan nilai field object berdasarkan enum
        customer.setLevel(CustomerLevel.PREMIUM);

        System.out.println(customer.getCustomerName());
        System.out.println(customer.getLevel());

        genreCustomer.setMale(Genre.MALE);
        genreCustomer.setFemale(Genre.FEMALE);

        //Konversi Enum ke String
        String levelName_String = CustomerLevel.STANDARD.name();

        //Mengembalikan String ke Enum
        CustomerLevel customerLevel = CustomerLevel.valueOf("STANDARD");
        System.out.println(customerLevel);

        //Mengetahui isi enum dengan foreach
        System.out.println("\nIsi dari Enum CustomerLevel: ");
        for (var value:CustomerLevel.values()) {
            System.out.println(value);
        }

        System.out.println("\nIsi dari Enum Genre: ");
        for(var isi: Genre.values()){
            System.out.println(isi);
        }


    }
}

class Customer{
    // field dengan tipe data dari Enum class
    CustomerLevel level;
    String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerLevel getLevel() {
        return level;
    }

    public void setLevel(CustomerLevel level) {
        this.level = level;
    }
}

class GenreCustomer{
    Genre male;
    Genre female;

    public Genre getMale() {
        return male;
    }

    public void setMale(Genre male) {
        this.male = male;
    }

    public Genre getFemale() {
        return female;
    }

    public void setFemale(Genre female) {
        this.female = female;
    }
}

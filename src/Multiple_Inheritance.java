public class Multiple_Inheritance {
    /*
        Multilevel Inheritance adalah pewarisan class berjenjang
        dari satu class ke class lain. Misalkan kita memiliki
        class A yang diturunkan kepada class B. Kemudian class B
        ini juga diturunkan kepada class C

        class A adalah kakek atau grand parent dari class C,
        maka semua property dan method dari class A juga bisa
        diakses dari class C.
     */
    public static void main(String[] args) {
        Netbook netbookAndi = new Netbook();

        System.out.println(netbookAndi.lihatSpec());
        System.out.println(netbookAndi.cekKomputer());
        System.out.println(netbookAndi.cekLaptop());
        System.out.println(netbookAndi.cekNetbook());
    }
}

//Gran Parent class
class Komputer {
    String processor = "Intel Core i9";
    String merk = "Asus";
    String memory = "16 GB";

    String cekKomputer() {
        return "Ini berasal dari class Komputer";
    }
}

// Parent class
class Laptop extends Komputer {
    String storage = "SSD 1TB";

    String cekLaptop() {
        return "Ini berasal dari class Laptop";
    }
}

// child class
class Netbook extends Laptop {
    String lihatSpec() {
        return "Merk: " + merk + ", processor: "+ processor +
                ", jumlah memory: " + memory +
                ", storage: "+ storage;
    }
    String cekNetbook() {
        return "Ini berasal dari class Netbook";
    }
}

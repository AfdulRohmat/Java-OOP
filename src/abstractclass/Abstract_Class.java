package abstractclass;

public class Abstract_Class {
    /*
        Abstract class adalah membuat class yang tidak bisa
        dibuat objectnya secara langsung. Hanya bisa diturunkan
        field dan atau methodnya ke class lain

        Pakai keyword abstract
            class abstract NamaClass{}

        Abstract class bisa digunakan sebagai kontrak untuk class
        childnya

        Abstract class bisa diakses oleh child seperti inheritance
        pada umumnya dengan keyword extends
     */

    public static void main(String[] args) {
        City city = new City();
        city.adress = "jakarta";
    }
}

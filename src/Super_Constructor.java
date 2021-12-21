public class Super_Constructor {
    /*
       Keyword super selain bisa dipakai untuk mengakses method
       milik parent class, bisa juga dipakai untuk mengakses
       constructor milik parent class
     */
    public static void main(String[] args) {

    }


}

class Luas{
    double panjang;
    double lebar;
    Luas(double panjang_param, double lebar_param){
        this.panjang = panjang_param;
        this.lebar = lebar_param;
    }

}

class LuasPersegi extends Luas{

    LuasPersegi(double panjang_param, double lebar_param){
        super(panjang_param, lebar_param);
    }
}
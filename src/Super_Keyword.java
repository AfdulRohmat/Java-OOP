public class Super_Keyword {
    /*
        Jika kita tetap ingin mengakses method yang sudah ter-overridden,
        itu bisa dilakukan dari dalam child class dengan bantuan
         keyword super
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getCornerFromParent());
        System.out.println(rectangle.getCorner());


    }
}

class Shape{
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{

    int getCorner(){
        return 4;
    }

    int getCornerFromParent(){
        return super.getCorner();
    }
}
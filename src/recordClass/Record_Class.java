package recordClass;

public class Record_Class {
    public static void main(String[] args) {

        // Membuat Object dari Record Class
        Login_Request login_request = new Login_Request("Afdul", "qwerty14");

        System.out.println(login_request);
        System.out.println(login_request.username());
        System.out.println(login_request.password());
    }
}

public class AksesField {
    public static void main(String[] args) {
        // panggil object
        Field field = new Field();

        // akses field dari object
        field.nama = "Ria";
        field.umur = 21;
        field.nilai = 88.2;

        System.out.println(field.nama);
        System.out.println(field.umur);
        System.out.println(field.nilai);

        System.out.println(field.kota);
        // Tidak bisa memnipulasi final field
    }
}

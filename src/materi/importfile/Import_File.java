package materi.importfile;

/*
    Import adalah kemampuan menggunakan class yang berada di
    package yang berbeda

    class yang mau diimport harus public class
 */

import access.modifier.Access_Modifier;

//import semua class di dalam package
import programmer.zama.now.data.*;

public class Import_File {
    public static void main(String[] args) {
        // mengambil class dari package lain
        Access_Modifier access_modifier = new Access_Modifier();

        ContohDua contohDua = new ContohDua();
        ContohSatu contohSatu = new ContohSatu();

    }
}

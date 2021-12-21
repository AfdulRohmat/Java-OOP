package access.modifier;

/*
    1. public -> (bisa diakses) oleh class, package,
                 subclass, world
    2. protected -> (bisa diakses) oleh class, package, subclass.
                    (Tidak bisa diakses) oleh world
    3. no modifier -> (bisa diakses) oleh class, pacakge
                      (Tidak bisa diakses) oleh subclass, world
    4. private -> (bisa diakses) oleh class
                  (Tidak bisa diakses) oleh package, subclass, world
 */


// Public class hanya bisa dibuat 1 public class di 1 file
public class Access_Modifier {
    // Protected
    protected String name;
    protected int age;

    // Private
    private int beratBadan;
    private String alamat;
}


package AdminMaker;

public class Run {
    public static void main(String[] args) {
        MasterAdmin admin = new MasterAdmin();
        admin.SetAkun("Mahasiswa 0101");
        admin.Setsandi("0101");
        System.out.println("Nama Akun \t: " + admin.GetAkun());
        System.out.println("Password \t: " + admin.Getsandi());
        admin.create();
        
    }
}

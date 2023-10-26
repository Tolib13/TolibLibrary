
package AdminMaker;


public class MasterAdmin {
    private String Akun;
    private String sandi;
    
    public void SetAkun(String Akun){
        this.Akun = Akun;
    }
    public void Setsandi(String sandi){
        this.sandi = sandi;
    }
    public String GetAkun(){
        return this.Akun;
    }
    public String Getsandi(){
        return this.sandi;
}
    public void create(){
        System.out.println("Create By Admin");
    }
}
    

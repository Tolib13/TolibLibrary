
package AkunRegister;

import java.util.UUID;

public class User {
    
    protected String username;
    protected String password;
   
    public static String Token() {
        String uuid = UUID.randomUUID().toString();
        return "Token Anda \t: " + uuid;
    }

    
    void register(String username,String password){
        this.username = username;
        this.password = password;
        System.out.println("\t\t//  Data Dimasukkan  \\");
        System.out.println("Username \t: "+username);
        System.out.println("Password \t: "+password);
        System.out.println(Token());
        System.out.println("Harap Mencatat token anda sebagai syarat pendaftaran :)");
        
    }
    
    void notifikasi(){
        System.out.println(" ");
        System.out.println("akun dibuat oleh user\n");
    }
    
    
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AkunRegister;

/**
 *
 * @author acer
 */
public class Admin extends User{
    @Override
    void register(String username, String password){
        System.out.println("\t\t//  Data Dimasukkan  \\");
        System.out.println("Usernama \t: "+username);
        System.out.println("Pasword \t\t: "+password);
        System.out.println(Token());
        System.out.println("Harap Mencatat token anda sebagai syarat pendaftaran :)");
        
    }
    @Override
    void notifikasi(){
        System.out.println(" ");
        System.out.println("Akun Dibuat Oleh Admin\n");
    }
}

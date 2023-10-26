/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author acer
 */
public class RunMobil {
    public static void main(String[] args) {
    //Memanggil
       MobilManual Manual = new MobilManual();
       MobilMatic Matic = new MobilMatic(); 
       
    //Tampil
       Matic.Jalankan();
       Manual.Jalankan();
    }
    
}

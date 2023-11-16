/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasStatis;

/**
 *
 * @author acer
 */
public class Pola {
    
    public void tampilan(){
        for (int i = 0; i < 10; i++){
            System.out.print('$');
        }
    }
    
    public void tampilan(char pola){
        for (int i = 0; i < 10; i++){
            System.out.print(pola);
        }
    }



    public static void main(String[] args) {
        
        Pola pl = new Pola();
        
        pl.tampilan();
        System.out.println(" ");
        pl.tampilan('@');
        System.out.println(" ");
    }
}

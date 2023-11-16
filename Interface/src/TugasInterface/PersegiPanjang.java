/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterface;

/**
 *
 * @author acer
 */
 class PersegiPanjang implements SegiBanyak {
     
     @Override
     public void getLuas(){
         int panjang = 6;
         int lebar = 5;
         int luas = panjang * lebar;
         System.out.println("Luas Persegi Panjang = " + luas);
     }
    
    public void getsisi(){
        System.out.println("Mempunyai 4 sisi");

}
    
}

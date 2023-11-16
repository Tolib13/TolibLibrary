/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterface;

/**
 *
 * @author acer
 */
 class Lingkaran implements SegiBanyak {

    @Override
    public void getLuas() {
         int panjang = 5;
         int luas = panjang * panjang;
         System.out.println("Panjang dari lingkaran = " +luas);
    }
    public void getsisi(){
        System.out.println("Tidak mempunyai sisi");
    }
     
}

  

    


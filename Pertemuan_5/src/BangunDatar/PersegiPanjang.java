
package BangunDatar;

public class PersegiPanjang extends MasterRumus{
    
    float panjang;
    float lebar;
    
    
    float luas(float panjang,float lebar){
        this.lebar = lebar;
        this.panjang = panjang;
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas);
        return luas;
    }
    
    @Override
    float keliling(){
        float klg = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + klg);
        return klg;
    }
}

 
package PolimorfismeStatic;


public class Lingkaran {
    //menghitung luas m
    float luas (float r){
        return (float)(Math.PI * r * r);
    }
    double luas (double d){
        return (double)(Math.PI * d * 1/4);
    }
    public static void main(String[] args) {
        
        Lingkaran lkr = new Lingkaran();
        float jari2 = 10;
        double diameter = 20;
        System.out.println("Luas Lingkaran dengan Jari Jari = " + lkr.luas(jari2));
        System.out.println("Luas Lingkaran dengan Diameter = " + lkr.luas(diameter));
        
    }
}

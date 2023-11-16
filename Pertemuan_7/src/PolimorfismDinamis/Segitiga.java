
package PolimorfismDinamis;

public class Segitiga extends bangunDatar{
    int alas;
    int tinggi;
    public Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
   @Override
   public float luas(){
       return (float) (( 0.5 * this.alas ) * this.tinggi);
   }
}

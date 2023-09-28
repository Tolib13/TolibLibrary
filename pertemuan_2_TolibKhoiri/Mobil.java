
package pertemuan_2_TolibKhoiri;

public class Mobil {
   static MasterMobil mobil = new MasterMobil();
    
    public static void main(String[] args) {
        System.out.println("ini adalah mobil avanza");
        System.out.println(mobil.warnamobil);
        System.out.println(mobil.merkmobil);
        System.out.println(mobil.tahun);
        mobil.berhenti();
        mobil.berjalan();
    }
}

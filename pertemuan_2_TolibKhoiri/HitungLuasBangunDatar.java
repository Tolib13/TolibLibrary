
package pertemuan_2_TolibKhoiri;
public class HitungLuasBangunDatar {

  static RumusLuasBangunDatar rumus = new RumusLuasBangunDatar();
    
    public static void main(String[] args) {
        System.out.print("Luas lingkaran dengan phi 3,14 dan r 10 memiliki nilai = ");
        System.out.println(rumus.rumusluaslingkaran( 3.14,10));
        
        System.out.print("Luas Persegi panjang dengan panjang 13 dan lebar 34 memiliki nilai = ");
        System.out.println(rumus.rumusluaspersegipanjang(13, 34));
        
    }
}

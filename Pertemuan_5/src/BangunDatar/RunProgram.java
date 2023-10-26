
package BangunDatar;

public class RunProgram {
    
    public static void main(String[] args) {
        System.out.println("\t\tMENGHITUNG BANGUN DATAR...\n\n");
        
        
        Lingkaran lkr = new Lingkaran();
        Persegi psg = new Persegi();
        PersegiPanjang psg_pj = new PersegiPanjang();
        Segitiga sgt = new Segitiga();
        
        System.out.println("Lingkaran : ");
        lkr.r=14;
        System.out.println("Lingkaran dengan jari jari "+ lkr.r);
        System.out.print("memiliki ");
        lkr.luas();
        System.out.print("memiliki ");
        lkr.keliling();
        System.out.println(" ");
        psg_pj.luas(5, 3);
        psg_pj.lebar=4;
        psg_pj.panjang=7;
        psg_pj.keliling();
        psg.sisi=7;
        psg.keliling();
        psg.luas();
        sgt.alas=6;
        sgt.tinggi=8;
        sgt.luas();
        
        
        
    }
}

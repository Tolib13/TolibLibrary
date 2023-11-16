package PolimorfismDinamis;

public class Run {

    public static void main(String[] args) {
        bangunDatar bgn = new bangunDatar();
        Lingkaran lkr = new Lingkaran(3);
        Persegi psg = new Persegi(5);
        Segitiga sgt = new Segitiga(5, 10);

        bgn.luas();
        bgn.keliling();
        System.out.println("keliling lingkaran = " + lkr.keliling());
        System.out.println("Luas lingkaran = " + lkr.luas());
        System.out.println("keliling Persegi = " + psg.keliling());
        System.out.println("keliling lingkaran = " + psg.luas());
        System.out.println("Luas Segitiga = " + sgt.luas());
    }

}

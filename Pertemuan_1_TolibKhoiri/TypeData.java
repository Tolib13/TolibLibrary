
package Pertemuan_1_TolibKhoiri;
import java.util.Scanner;

public class TypeData {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, klas;
        int usia;
        long no;
        
        System.out.println("Penerapan Type Data");
        System.out.println(" ");
        System.out.println("\t\t\tRekap Data Mahasiswa Ilkom");
        System.out.println("\t\t\t===========================");
        System.out.println(" ");
        System.out.print("Nama Mahasiswa\t: ");
        nama = input.nextLine();
        System.out.print("Kelas A/B\t: ");
        klas = input.nextLine();
        System.out.print("Usia\t\t: ");
        usia = input.nextInt();
        System.out.print("NIM\t\t: ");
        no = input.nextLong();
         System.out.println("=========================");
        System.out.println("Nama Mahasiswa\t=  " + nama);
        System.out.println("Kelas \t\t=  3 " + klas);
        System.out.println("Usia \t\t=  " + usia + " tahun");
        System.out.println("NIM \t\t= " + no);
        
        
        
    }
    
}


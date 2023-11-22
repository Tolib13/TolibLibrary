package AkunRegister;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil;

        System.out.println("\t\t\t Form Registrasi");
        System.out.println("\t\t============================\n");

        do {
            System.out.println("Pilih Pengguna : 1/2");
            System.out.println(" 1.User \n 2. Admin \n 3. Exit");
            System.out.print("Pilih => ");
            pil = in.nextInt();
            switch (pil) {
                case 1 -> {
                    User user = new User();
                    System.out.println("Masukan Username : ");
                    in.nextLine();
                    String username = in.nextLine();
                    System.out.println("Masukan Password : ");
                    String password = in.nextLine();
                    user.register(username, password);
                    user.notifikasi();
                }

                case 2 -> {
                    User admin = new Admin();
                    System.out.println("Masukan Username : ");
                    in.nextLine();
                    String username = in.nextLine();
                    System.out.println("Masukan Password : ");
                    String password = in.nextLine();
                    admin.register(username, password);
                    admin.notifikasi();
                }
                case 3 ->
                    System.out.println("\n\t\t\t\tTerimakasih!!!!");
                default ->
                    System.out.println("Perhatikan Masukan Anda !!!");
            }

        } while (pil != 3);
    }

}


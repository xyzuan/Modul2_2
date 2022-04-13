import java.util.Scanner;

public class HitungStructured {

    // mainBelahKetupat & Scanner Modules
    Scanner input = new Scanner(System.in);
    Ketupat mainKetupat = new Ketupat();

    // Main
    public void mainStructured(){
        System.out.println("Kalkulator Bangun Belah Ketupat ( Structured )");
        System.out.println("1. Hitung luas");
        System.out.println("2. Hitung keliling");
        System.out.print("Masukkan pilihan : ");
        int params = input.nextInt();
        switch (params) {
            // Case 1 are assigned for Luas Operation
            case 1 -> {
                System.out.print("\nMasukkan Diagonal-1 : ");
                int d1 = input.nextInt();
                System.out.print("Masukkan Diagonal-2 : ");
                int d2 = input.nextInt();
                System.out.println("\nLuas belah ketupat : " + ( d1 * d2 * 0.5 ));
            }
            // Case 2 are assigned for Keliling Operation
            case 2 -> {
                System.out.print("\nMasukkan Sisi : ");
                int sisi = input.nextInt();
                System.out.println("\nKeliling belah ketupat : " + ( 4 * sisi));
            }
            default -> System.out.println("Inputan Salah");
        }
        // Method to falling back to menu
        System.out.print("Kembali ke menu ? Y/n : ");
        char balik = input.next().charAt(0);
        if( balik == 'Y' || balik == 'y' ){
            System.out.println("\n");
            mainStructured();
        } else {
            mainKetupat.optionMode();
        }
    }
}

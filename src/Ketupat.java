import java.util.Scanner;

public class Ketupat {

    // Object
    public static Ketupat main = new Ketupat();
    public Scanner inputMenu = new Scanner(System.in);
    public HitungOOP oop = new HitungOOP();
    public HitungStructured strcd = new HitungStructured();

    // Main
    public static void main(String[] args) {
        main.optionMode();
    }

    // Option Mode Menu
    public void optionMode(){
        System.out.println("Kalkulator Bangun Belah Ketupat");
        System.out.println("1. OOP");
        System.out.println("2. Terstruktur");
        System.out.println("0. Keluar");
        System.out.print("Masukkan pilihan : ");
        int pilih = inputMenu.nextInt();
        if(pilih == 1){
            oop.mainOOP();
        } else if (pilih == 2){
            strcd.mainStructured();
        } else if (pilih == 0){
            System.exit(0);
        }
    }
}

import java.util.Scanner;

public class Ketupat {

    private int D1;
    private int D2;
    private int Sisi;
    public double Luas;
    public double Keliling;

    public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Ketupat obj = new Ketupat();
        obj.menu();
    }

    public void menu(){
        System.out.println("Kalkulator Bangun Belah Ketupat");
        System.out.println("1. Hitung luas");
        System.out.println("2. Hitung keliling");
        System.out.print("Masukkan pilihan : ");
        int params = input.nextInt();
        switch (params) {
            case 1 -> {
                System.out.print("\nMasukkan Diagonal-1 : ");
                setD1(input.nextInt());
                System.out.print("Masukkan Diagonal-2 : ");
                setD2(input.nextInt());
                hitungLuas(getD1(), getD2());
                System.out.println("\nLuas belah ketupat : " + Luas);
            }
            case 2 -> {
                System.out.print("\nMasukkan Sisi : ");
                setSisi(input.nextInt());
                hitungKeliling(getSisi());
                System.out.println("\nKeliling belah ketupat : " + Keliling);
            }
            default -> System.out.println("Inputan Salah");
        }
        System.out.print("Kembali ke menu ? 1/0 : ");
        int balik = input.nextInt();
        if(balik == 1){
            System.out.println("\n");
            menu();
        }
    }

    public double hitungLuas(int params1, int params2){
        return Luas = params1 * params2 * 0.5;
    }

    public double hitungKeliling(int params){
        return Keliling = 4 * params;
    }

    public int getD1() {
        return D1;
    }

    public void setD1(int d1) {
        D1 = d1;
    }

    public int getD2() {
        return D2;
    }

    public void setD2(int d2) {
        D2 = d2;
    }

    public int getSisi() {
        return Sisi;
    }

    public void setSisi(int sisi) {
        Sisi = sisi;
    }
}

import java.util.Scanner;

public class HitungOOP {

    /* Belah Ketupat Arrays Value Atribute
       [0] are assigned for D1 ( Diagonal 1 )
       [1] are assigned for D2 ( Diagonal 2 )
       [2] are assigned for Sisi
     */
    private final int[] belahKetupat = new int[3];

    // Belah Ketupat Result Attribute
    private double Luas, Keliling;

    // mainBelahKetupat & Scanner Obj
    Ketupat mainKetupat = new Ketupat();
    Scanner input = new Scanner(System.in);

    // Main
    public void mainOOP(){
        System.out.println("Kalkulator Bangun Belah Ketupat ( OOP )");
        System.out.println("1. Hitung luas");
        System.out.println("2. Hitung keliling");
        System.out.print("Masukkan pilihan : ");
        int params = input.nextInt();
        switch (params) {
            // Case 1 are assigned for Luas Operation
            case 1 -> {
                System.out.print("\nMasukkan Diagonal-1 : ");
                setBelahKetupat(0,input.nextInt());
                System.out.print("Masukkan Diagonal-2 : ");
                setBelahKetupat(1,input.nextInt());
                hitungLuas(getBelahKetupat(0), getBelahKetupat(1));
                System.out.println("\nLuas belah ketupat : " + getLuas());
            }
            // Case 2 are assigned for Keliling Operation
            case 2 -> {
                System.out.print("\nMasukkan Sisi : ");
                setBelahKetupat(2,input.nextInt());
                hitungKeliling(getBelahKetupat(2));
                System.out.println("\nKeliling belah ketupat : " + getKeliling());
            }
            default -> System.out.println("Inputan Salah");
        }
        balikMenu();
    }

    // Belah Ketupat Luas & Keliling Operation
    public void hitungLuas(int params1, int params2){
        this.Luas = params1 * params2 * 0.5;
    }
    public void hitungKeliling(int params){
        this.Keliling = 4 * params;
    }

    // Getter Luas & Keliling
    public double getLuas(){
        return Luas;
    }
    public double getKeliling(){
        return Keliling;
    }

    // Getter Setter Belah Ketupat
    public int getBelahKetupat(int arr) {
        return belahKetupat[arr];
    }
    public void setBelahKetupat(int arr, int params) {
        this.belahKetupat[arr] = params;
    }

    // Method to falling back to menu
    public void balikMenu(){
        System.out.print("Kembali ke menu ? Y/n : ");
        char balik = input.next().charAt(0);
        if( balik == 'Y' || balik == 'y' ){
            System.out.println("\n");
            mainOOP();
        } else if ( balik == 'N' || balik == 'n' ) {
            mainKetupat.optionMode();
        } else {
            System.out.println("Inputan Salah");
            balikMenu();
        }
    }
}
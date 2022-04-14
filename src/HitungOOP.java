/*
 * Copyright (C) 2022 xyzuan ( Jody Yuantoro )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Scanner;

public class HitungOOP {

    /* Belah Ketupat Arrays Value Atribute
       [0] are assigned for D1 ( Diagonal 1 )
       [1] are assigned for D2 ( Diagonal 2 )
       [2] are assigned for Sisi
     */
    private final double[] belahKetupat = new double[3];

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
                System.out.print("\nMasukkan Diagonal-1 : "); setBelahKetupat(0,input.nextDouble());
                System.out.print("Masukkan Diagonal-2 : "); setBelahKetupat(1,input.nextDouble());
                hitungLuas(getBelahKetupat(0), getBelahKetupat(1));
            }
            // Case 2 are assigned for Keliling Operation
            case 2 -> {
                System.out.print("\nMasukkan Sisi : "); setBelahKetupat(2,input.nextDouble());
                hitungKeliling(getBelahKetupat(2));

            }
            default -> System.out.println("Inputan Salah");
        }
        balikMenu();
    }

    // Belah Ketupat Luas & Keliling Operation
    public void hitungLuas(double params1, double params2){
        System.out.println("\nLuas belah ketupat : " + ( params1 * params2 * 0.5 ));
    }
    public void hitungKeliling(double params){
        System.out.println("\nKeliling belah ketupat : " + ( 4 * params ));
    }

    // Getter Setter Belah Ketupat
    public double getBelahKetupat(int arr){
        return belahKetupat[arr];
    }
    public void setBelahKetupat(int arr, double params){
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

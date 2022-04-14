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

public class HitungStructured {

    // Main
    public void mainStructured(){

        // mainBelahKetupat & Scanner Modules
        Scanner input = new Scanner(System.in);
        Ketupat mainKetupat = new Ketupat();

        System.out.println("Kalkulator Bangun Belah Ketupat ( Structured )");
        System.out.println("1. Hitung luas");
        System.out.println("2. Hitung keliling");
        System.out.print("Masukkan pilihan : ");
        int params = input.nextInt();
        switch (params) {
            // Case 1 are assigned for Luas Operation
            case 1 -> {
                System.out.print("\nMasukkan Diagonal-1 : "); double d1 = input.nextDouble();
                System.out.print("Masukkan Diagonal-2 : "); double d2 = input.nextDouble();
                System.out.println("\nLuas belah ketupat : " + ( d1 * d2 * 0.5 ));
            }
            // Case 2 are assigned for Keliling Operation
            case 2 -> {
                System.out.print("\nMasukkan Sisi : "); double sisi = input.nextDouble();
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

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

public class Ketupat {

    // Main
    public static void main(String[] args) {
        Ketupat main = new Ketupat();
        main.optionMode();
    }

    // Option Mode Menu
    public void optionMode(){

        Scanner inputMenu = new Scanner(System.in);
        HitungOOP oop = new HitungOOP();
        HitungStructured strcd = new HitungStructured();

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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Percobaan1;

/**
 *
 * @author KHALILUL
 */
public class Mobil {
        String merk, warna;
        int tahunproduksi;
        
        public void Maju(){
            int kec = 10;
            System.out.println("Mobil maju sejauh " + kec + " meter");
        }
        public void Mundur(){
            int kec = 5;
            System.out.println("Mobil mundur sejauh " + kec + " meter");
        }
    }

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author KHALILUL
 */
public class Tugas02JS10 {
    String nama_mhs;
    char semester;
    int nim_mhs;
    float ip_mhs;
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap       : ");
        nama_mhs = input.nextLine();
        System.out.print("Masukkan NIM                : ");
        nim_mhs = input.nextInt();
        System.out.print("Masukkan Semester           : ");
        semester = input.next().charAt(0);
        System.out.print("Masukkan IP Semester Ini    : ");
        ip_mhs = input.nextFloat();
    }
    
    public void datamhs(){
        System.out.println("Nama Mahasiswa  : " + nama_mhs);
        System.out.println("NIM             : " + nim_mhs);
        System.out.println("Semester        : " + semester);
        System.out.println("IP Semester Ini : " + ip_mhs);
    }
    
    public void stat(){
         if(ip_mhs>=3.5){
            System.out.println("Anda berhak mengontrak 24 SKS pada semester V");
        }
        else if(ip_mhs>=3){
            System.out.println("Anda berhak mengontrak 22 SKS pada semester V");
        }
        else if(ip_mhs>=2.5){
            System.out.println("Anda berhak mengontrak 20 SKS pada semester V");
        }
        else if(ip_mhs>=2){
            System.out.println("Anda berhak mengontrak 18 SKS pada semester V");
        }
        else{
            System.out.println("Anda berhak mengontrak 15 SKS pada semester V");    
        }
    }
    
    public static void main(String[] args){
        Tugas02JS10 A = new Tugas02JS10();
        A.input();
        A.datamhs();
        A.stat();
    }
}

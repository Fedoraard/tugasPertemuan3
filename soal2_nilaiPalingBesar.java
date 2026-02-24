/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajar_pbo.PERTEMUAN3;

/**
 *
 * @author Fedora
 */
import java.util.Scanner;  
public class soal2_nilaiPalingBesar {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int angka_pertama, angka_kedua, angka_ketiga, terbesar;
    
    System.out.println("masukkan angka pertama: ");
    angka_pertama=input.nextInt();
    System.out.println("masukkan angka kedua: ");
    angka_kedua=input.nextInt();
    System.out.println("masukkan angka ketiga: ");
    angka_ketiga=input.nextInt();
    
    System.out.println("angka pertama: "+angka_pertama);
    System.out.println("angka kedua: "+angka_kedua);
    System.out.println("angka ketiga: "+angka_ketiga);
    
    if(angka_pertama >= angka_kedua && angka_pertama >= angka_ketiga){
        terbesar=angka_pertama;
    }else if(angka_kedua >= angka_pertama && angka_kedua >= angka_ketiga){
        terbesar = angka_kedua;
    }else{
        terbesar=angka_ketiga;
    }
    
    System.out.println("Nilai terbesar adalah: "+terbesar);
    
    if(terbesar == angka_pertama){
        System.out.println("angka pertama (" +angka_pertama+ ") adalah yang paling besar");        
    } else if (terbesar == angka_kedua){
        System.out.println("angka kedua (" +angka_kedua+ ") adalah yang paling besar");
    } else{
        System.out.println("Angka ketiga (" +angka_ketiga+ ") adalah yang paling besar");
    }
    input.close();
    }
}

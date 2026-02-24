


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

public class soal3_biayaParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlahData;
        int biaya_2jamPertama = 1500;
        int biaya_perJamBerikutnya = 1000;
        
        System.out.print("Masukkan jumlah data parkir: ");
        jumlahData = input.nextInt();
        
        int[] jamMasuk = new int[jumlahData];
        int[] jamKeluar = new int[jumlahData];
        int[] lamaParkir = new int[jumlahData];
        int[] biayaParkir = new int[jumlahData];
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("\nData ke-" + (i+1));
            System.out.print("Jam masuk (0-23): ");
            jamMasuk[i] = input.nextInt();
            System.out.print("Jam keluar (0-23): ");
            jamKeluar[i] = input.nextInt();
            
            if (jamKeluar[i] >= jamMasuk[i]) {
                lamaParkir[i] = jamKeluar[i] - jamMasuk[i];
            } else {
                lamaParkir[i] = (24 - jamMasuk[i]) + jamKeluar[i];
            }
            
            if (lamaParkir[i] <= 2) {
                biayaParkir[i] = biaya_2jamPertama;
            } else {
                biayaParkir[i] = biaya_2jamPertama + (lamaParkir[i] - 2) * biaya_perJamBerikutnya;
            }
        }
        
        System.out.println("\n=================================================================");
        System.out.println("| No | Jam Masuk | Jam Keluar | Lama Parkir | Tarif Parkir (Rp) |");
        System.out.println("=================================================================");
        
        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("| %2d |     %2d     |     %2d     |     %2d Jam   |      %4d        |%n", 
                              (i+1), jamMasuk[i], jamKeluar[i], lamaParkir[i], biayaParkir[i]);
        }
        
        System.out.println("=================================================================");
        
        input.close();
    }
}
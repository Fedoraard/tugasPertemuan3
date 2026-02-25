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
    
    int jamMasuk, jamKeluar, lamaParkir, biayaParkir, biaya_2jamPertama=1500, biaya_perJamBerikutnya=1000;
    
    System.out.println("Masukkan jam masuk (0-23): ");
    jamMasuk=input.nextInt();
    System.out.println("Masukkan jam keluar (0-23): ");
    jamKeluar=input.nextInt();
    
    if(jamKeluar >= jamMasuk){
        lamaParkir = jamKeluar - jamMasuk;
    }else if(jamKeluar <= jamMasuk){
        lamaParkir=(24-jamMasuk + jamKeluar);
    }else{
        lamaParkir = 0;
        System.out.println("kasus tidak terduga terjadi");
    }
    
    if(lamaParkir <=2){
        biayaParkir=biaya_2jamPertama;
    }else{
        biayaParkir = biaya_2jamPertama + (lamaParkir-2) * biaya_perJamBerikutnya;
    }
    System.out.println("jam masuk: "+jamMasuk);
    System.out.println("jam keluar: "+jamKeluar);
    System.out.println("lama parkir: "+lamaParkir+"jam");
    System.out.println("biaya parkir: Rp "+biayaParkir);
    
    input.close();
    }
}

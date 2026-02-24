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

public class soal1_3buahinteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int bilangan1, bilangan2, bilangan3, totalRibuan=0;
        
        System.out.println("masukkan bilangan ke 1: ");
        bilangan1=input.nextInt();
        System.out.println("masukkan bilangan ke 2: ");
        bilangan2=input.nextInt();
        System.out.println("masukkan bilangan ke 3: ");
        bilangan3=input.nextInt();
        
        System.out.println("bilangan 1: "+bilangan1 + "->");
        if (bilangan1 >=1000 && bilangan1 <= 9999){
            System.out.println("RIBUAN (4 digit positif)");
            totalRibuan++;
        }else if(bilangan1 <=-1000 && bilangan1 >= -9999){
            System.out.println("RIBUAN (4 digit negatif)");
            totalRibuan++;
        }else{
            System.out.println("BUKAN RIBUAN");
        }
            
        System.out.println("bilangan 2: "+bilangan2 + "->");
        if(bilangan2 >=1000 && bilangan2 <=9999){
            System.out.println("RIBUAN (4 digit positif)");
            totalRibuan++;
        }else if(bilangan2 <=-1000 && bilangan2 >= -9999){
            System.out.println("RIBUAN (4 digit negatif)");
            totalRibuan++;
        }else{
            System.out.println("BUKAN RIBUAN");
        }
        
        System.out.println("bilangan 3: "+bilangan3 + "->");
        if(bilangan3 >=1000 && bilangan3 <=9999){
            System.out.println("RIBUAN (4 digit positif)");
            totalRibuan++;
        }else if(bilangan3 <=-1000 && bilangan3 >= -9999){
            System.out.println("RIBUAN (4 digit negatif)");
            totalRibuan++;
        }else{
            System.out.println("BUKAN RIBUAN");
        }
        
        System.out.println("Total bilangan ribuan: " +totalRibuan + "dari 3 bilangan");
        
        input.close();
    }
        
        
        
    }
        
        

    

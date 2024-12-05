/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl1_soal3;

/**
 *
 * @author USER
 */
public class UKL1_soal3 {

    public static void main(String[] args) {
     
         for (int i = 50; i >= 1; i--) {
            if (i % 3 == 0 && i > 0 && i != 1) {
                System.out.println(i + ". Saya angkatan 33 ");
            } else if (i % 2 == 0 && i > 0 && i != 1) {
                System.out.println(i + ". Saya anak moklet");
            } else if (i % 2 != 0 && i % 3 != 0 && i > 0 && i != 1){
                System.out.println(i + ". Saya anak wikusama");
            } else if ( i == 1){
                System.out.println( 1 + ". Saya senang");
            } else {
                return;
            }    
    }
  }
}

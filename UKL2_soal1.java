/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl2_soal1;


/**
 *
 * @author USER
 */
public class UKL2_soal1 {

    public static void main(String[] args) {
       int tabunganperbulan = 100000;
       int totaltabungan = 0;
        
        for (int bulan = 1; bulan <= 24; bulan++) {
            System.out.println("Tabungan bulan ke-" + bulan + ": Rp" + tabunganperbulan);
            totaltabungan += tabunganperbulan;
            tabunganperbulan += 20000;
        }
        System.out.println("Total tabungan selama 12 bulan: Rp" + totaltabungan);
        }
        public static double total(int tabunganperbulan) {
            int totaltabungan = 0;
            for (int i = 1; i <= 24; i++) {
            totaltabungan += tabunganperbulan;
            tabunganperbulan += 20000;
            }
             return totaltabungan;
        }
}
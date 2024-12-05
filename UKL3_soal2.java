/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl3_soal2;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class UKL3_soal2 {

    public static void main(String[] args) {
        int [] bil = {9, -5, 7, 8, -2, -4};
        ArrayList<Integer> negativeElements = new ArrayList<>();
    
        for (int a = 0; a < bil.length; a++) {
            if (bil[a] > 0){
                negativeElements.add(bil[a]);
        }
        }
         if (negativeElements.isEmpty()) {
            System.out.println("Array tidak mengandung elemen positif.");
        } else {
            System.out.print("Array mengandung elemen positif: ");
         
        }
            
            for (int n = 0; n < negativeElements.size(); n++) {
                System.out.print(negativeElements.get(n));
                if (n < negativeElements.size() - 1) {
                    System.out.print(", ");
    }
}
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no1;

import java.util.Scanner;

/**
 *
 * @author Praktikum
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] bil = new int[100];
        bil[0] = 0;
        bil[1] = 1;
        int Deret;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah deret : ");
        String data = input.nextLine();
        
        Deret = Integer.parseInt(data);
        for (int i = 0; i < Deret; i++) {
            System.out.print(bil[i]+" ");
            bil[i+2] = bil[i] + bil[i + 1];
            
        }
        
    }
    
}

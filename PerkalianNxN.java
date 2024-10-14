/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum7_no2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PerkalianNxN {
 public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nilai n (Maksimal 10): ");
        int n = scanner.nextInt();
        if (n > 10) {
            System.out.println("Nilai n tidak boleh dari 10");
            return;
        }
         System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println();
        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%3d|", i);  
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3d ", i * j);  
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum7_no1;

/**
 *
 * @author LENOVO
 */
public class BilanganPrima {
     public static void main(String [] args){
        for (int n = 0; n <= 20; n++){
            if (n == 0) {
                System.out.println( n + "Bukan Termasuk Bilangan Prima");
            }else if (n == 1){
                System.out.println( n + "Termasuk Bilangan Prima");
            }else {
                boolean BilanganPrima = true;
                for ( int i = 2; i <= Math.sqrt(n); i++){
                    if (n % i == 0){
                        BilanganPrima = false;
                        break;
                    }
                }
                if (BilanganPrima){
                    System.out.println( n + "Termasuk Bilangan Prima");
                }else {
                    System.out.println( n + "Termasuk Bilangan Prima");
                }
            }
        }
    }
}


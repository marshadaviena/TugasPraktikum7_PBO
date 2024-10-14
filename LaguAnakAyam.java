/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7_no1;

/**
 *
 * @author LENOVO
 */
public class LaguAnakAyam {
    public static void main(String [] args){
        int N = 10;
        for(int n = N; n >= 1; n--){
            if (n > 1){
            System.out.println("Anak Ayam Turun " + n + "Mati Satu Tinggal " + (n - 1));
        } else {
                System.out.println("Anak Ayam Turun " + n + "Mati Satu Habis Semua");
            }
    }
    }   
}

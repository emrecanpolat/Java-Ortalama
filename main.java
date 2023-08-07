package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);  // Create a Scanner object 1 kere tanımlamak yeterli
        System.out.print("Enter matematik not");
        mat = input.nextInt();  // Read user input

        System.out.print("Enter fizik not");
        fizik = input.nextInt();  // Read user input

        System.out.println("Enter kimya not");
        kimya = input.nextInt();  // Read user input

        System.out.println("Enter türkçe not");
        turkce = input.nextInt();  // Read user input

        System.out.println("Enter tarih not");
        tarih = input.nextInt();  // Read user input

        System.out.println("Enter müzik not");
        muzik = input.nextInt();  // Read user input

        int ortalama = (mat+fizik+turkce+kimya+tarih+muzik)/6;

        if (ortalama>=60){
            System.out.println("Ortalamanız: "+ ortalama + " Sınıfı Geçtiniz");
        }else {
            System.out.println("Ortalamanız: "+ ortalama + " Sınıfta kaldınız");
        }


    }
}

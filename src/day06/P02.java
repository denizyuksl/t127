package day06;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        /*
         Kullanıcıdan bir sayi alıp  sayinin rakamları  toplamini
         while loop ile yapin bir method create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        int sayi= scan.nextInt();
        int toplam=0;
        while (sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println(toplam);







    }
}

package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

    /*
    Girilen desimal(10'luk tabanda sayı) değeri binary(2'lik sayi düzeni) değere çeviren 
    methodu oluşturunuz.
     örn:12=1 1 0 0  
    */

        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen bir desimal sayı giriniz");
        int sayi =scan.nextInt();
        System.out.println(sayi+" Degerinin binary karsıligi: " +binaryDonusum(sayi));
    }

    private static ArrayList<Integer> binaryDonusum(int sayi) {

        ArrayList<Integer>binary= new ArrayList<>();
        while (sayi>=1){

            binary.add(sayi%2);// sayiyi 2'ye  bölüp kalanı ekleyecek
            sayi/=2;// sayi=sayi/2
        }

        Collections.reverse(binary);

        return binary;
   }

}

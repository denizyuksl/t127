package day05;

import java.util.Scanner;

public class P08_Odev {

    public static void main(String[] args) {


      /*  2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

        Örnek Ekran çıktısı
        1  2  3  4  5
        2  4  6  8 10
        3  6  9 12 15
        4  8 12 16 20
        5 10 15 20 25

       */
       int satir=10;
       int sutun=10;
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }



    }
}
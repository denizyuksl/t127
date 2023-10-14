package day06;

public class P03 {
    public static void main(String[] args) {


        /* iki basamaklı 7 ile bölünebilen  pozitif tamsayıları While loop ile yazdırınız

         */

         int sayi =10;
         String sayilar="";
         while (sayi<100){
             if (sayi%7==0){
                // System.out.println(sayi+ " ");
                 sayilar+=sayi+",";
             }
             sayi++;
         }
        System.out.println(sayilar.substring(0,sayilar.length()-1));


    }

}

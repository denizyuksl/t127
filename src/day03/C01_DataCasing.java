package day03;

import java.util.Scanner;

public class C01_DataCasing {
    public static void main(String[] args){

        // 1- Double olarak verilen 3 sayının toplamını int olarak yazdırın
        //ipucu: double>float>long>int>short>byte


        double a=3, b= 7, c =3.12;
        int toplam =(int) (a+b+c);
        // System.out.println("a = " + a);
        System.err.println("toplam:" +toplam);//toplam:13 bu şekilde renkli yazdırıyor.


        /*
        Kullanıcıdan bir harf girmesini isteyiniz.O harften sonra gelen harfleri
        Girdiğiniz harf:
        Girdiğiniz harften sonraki üç harf:
        şeklinde yazdırın.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);
        System.out.println("Girdiğiniz harf: "+harf);
        System.out.println("Girdiğiniz harften sonraki üç harf: "+(char)(harf+1)+" "+(char)(harf+2)+" "+(char)(harf+3)+"'dir");
    }
}

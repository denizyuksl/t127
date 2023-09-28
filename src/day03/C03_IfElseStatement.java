package day03;

import java.util.Scanner;

public class C03_IfElseStatement {
    public static void main(String[] args) {

        /*
        1- Öğreci notunu harf notuna dönüştüren bir kod yazınız.
        85-100------->AA
        80-85-------->BA
        75-80-------->BB
        65-75-------->CB
        50-65-------->CC
        50 Altı ise ----->FF
         */

        Scanner scan = new Scanner(System.in);
       /* System.out.println(("Lütfen sınav notunu giriniz :"));
       int not = scan.nextInt();

       if (not>=85 && not<=100){
            System.out.println("girdiğiniz "+not+" değerinin karşılığı AA"  );
        } else if (not>=80 && not<85) {
            System.out.println("Girdiğiniz "+not+" değerinin karşılığı BA");
        } else if (not>=75 && not<80) {
            System.out.println("Girdiğiniz "+not+" değerinin karşılığı BB");
        } else if (not>=65 && not<70) {
            System.out.println("Girdiğiniz "+not+" değerinin karşılığı CB");
        } else if (not>=50 && not<65) {
            System.out.println("Girdiğiniz  "+not+" değerinin karşılığı CC");
        }else if (not>=0 && not<50){
            System.out.println("Girdiğiniz "+not+" değerinin karşılığı FF");
          }else
            System.out.println("Yanlış bir değer girdiniz Lütfen 0--100 bir değer giriniz");
    */
       /*
         2-Kullanıcıdan cinsiyetini ve yasini alın,
         Kadin,60 yas ve üzeri,
         Erkek 65 yas ve üzeri emekli olabilir.
         Cinsiyet ve yasına baglı olarak:
         "Emekli olabilirsin" veya "e-Emekli olmak için ...yıl daha çalışman gerekir" yazdirin.
       */
        System.out.println("Lütfen cinsiyetinizi 'E' veya 'K' olarak giriniz. ");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("Lütfen yasınızı giriniz.");
        int yas = scan.nextInt();

        if ((cinsiyet == 'K' || cinsiyet == 'k') && yas >= 60) {
            System.out.println("Emekli olabilirsiniz. ");
       }if ((cinsiyet == 'K' || cinsiyet == 'k') && yas < 60) {
            System.out.println("Emekli olabilmek için " + (60 - yas) + "yıl çalışmalısınız ");
        }if ((cinsiyet == 'E' || cinsiyet == 'e') && yas >= 65) {
            System.out.println("Emekli olabilirsiniz");
        }if ((cinsiyet == 'E' || cinsiyet == 'e') && yas < 65) {
            System.out.println("Emekli olabilmek için " + (65 - yas) + "yıl çalışmalısınız");
        }else {
            System.out.println("Girdiğiniz değerlerden en az biri yanlıştır");

            System.out.println("deneme");

        }
    }
}



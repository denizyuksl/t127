package day04;

import java.util.Scanner;

public class P04_ternaryOperator {
    public static void main(String[] args) {

   /*
    Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50’den
    kucukse "Maalesef kaldin" yazdirin.
   */
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen yılsonu notunuzu giriniz");
        double not = scan.nextDouble();
        System.out.println(not>50?"Sınıfı geçtiniz":"Maalesef kaldınız");
    }
  }

package day05;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {


        /*
        Sayacı ritmik ilerleyen işlemlerde ForLoop kullanılır.
        Sayaç ritmikse While kullanılır.
        döngüye en az bir kere girilecekse do While loop lullanılır.

         */

              /*
        SORU:Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayı= scan.nextInt();
        for (int i = 1; i <=girilenSayı ; i++) {
            if (i%7==0){
                System.out.print(i+"-");
            }

        }
        System.out.println("");
        System.out.println("========İşlem  Tamamlandı========");

    }
}

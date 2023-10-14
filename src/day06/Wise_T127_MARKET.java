package day06;

import java.util.Scanner;

public class Wise_T127_MARKET {


    static Scanner scan =new Scanner(System.in);
    static String urunAdi;
    static int urunKodu;
    static double urunFiyati;
    static int urunMiktari;
    static double toplam;
    static String sepet="";
    static boolean ekUrun=false;



    public static void main(String[] args) {
         /*
   *
  ====================WISE T127 MARKET===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET ÜRÜNLERİ
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin
  6-sonunda fis yazdırsın
    */
       girisEkrani() ;


    }

    private static void girisEkrani() {
        System.out.println(" ====================WISE T127 MARKET===================================");
        System.out.println("=====================HOSGELDİNİZ===================================");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
        System.out.println("manav için 1\nŞarküteri Ürünleri için2\nMarket ürünleri için3\nFiş yazdırmak için4\n" +
                "Çıkış yapmak için5\n");
        int secim= scan.nextInt();
        if( !(secim>=1&&secim<=5)){
            System.out.println("yanlış bir giriş yaptınız Tekrar deneyiniz!");
            girisEkrani();
        }else{
            switch (secim){
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisyazdir();
                    break;
                case 5:
                    Çikis();




            }
        }
    }
}

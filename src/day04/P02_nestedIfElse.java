package day04;

import java.util.Scanner;

public class P02_nestedIfElse {
    public static void main(String[] args) {

        /*
        KUllanıcıdan aldığı ürün adedi ve liste fiyatı alın,kullanıcıya müşteri kartı olup olmadığını sorun.
        Müşteri kartı varsa,
        -10 üründen fazla alırsa %20
        -10 üründen az alırsa %15 indirim yapın.
        Müşteri kartı yoksa,
        -10 üründen fazla alırsa %15
        -10 üründen az alırsa %10 indirim yapın.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen almak istediğiniz ürün adedini giriniz");
        int adet = scan.nextInt();
        System.out.println("Ürün liste fiyatı: ");
        double fiyat = scan.nextDouble();
        System.out.println("T 127 kartınız var mı? E/H");
        char kart = scan.next().charAt(0);

        if (kart == 'E' || kart == 'e') {

            if (adet >= 10) {
                System.out.println("%20 müşteri indirimli toplam tutar: " + ((adet * fiyat) * (0.8)));
            } else {
                System.out.println("%15 müşteri indirimi tutarı: " + (adet * fiyat) * (0.85));

            }
        } else if (kart == 'H' || kart == 'h') {
            if (adet >= 10) {
                System.out.println("%15 müşteri indirimli toplam tutar:" + ((adet * fiyat) * (0.85)));
            } else {
                System.out.println("%10 müşteri indirimli toplam tutar:" + ((adet * fiyat) * (0.9)));
            }
        }
    }
}
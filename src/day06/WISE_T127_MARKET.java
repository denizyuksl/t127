package day06;

import java.util.Scanner;

public class WISE_T127_MARKET {


    static Scanner scan = new Scanner(System.in);
    static String urunAdi = "";
    static int urunKodu;
    static double urunFiyati;
    static int urunMiktari;

    static double toplam;

    static String sepet = "";
    static boolean ekUrun = false;


    public static void main(String[] args) {
           /*
   *
  ==================== WISE T127 MARKET ===================================
       ilk programa girildiginde bizi bir menu karsilasin bu secenekler
           1 ŞARKÜTERİ ÜRÜNLERİ
           2 MANAV ÜRÜNLERİ
           3 MARKET ÜRÜNLERİ
        secime gore ,
           4-urunleri listele ve
           5-fiyatlari gelsin
           6-sonunda fis yazdırsın
          */
        girisEkrani();

    }

    private static void girisEkrani() {
        System.out.println("==================== WISE T127 MARKET ===================================");
        System.out.println("================== H O Ş G E L D İ N İ Z  =================================");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz!");
        System.out.println("Manav Ürünleri için 1\nŞarküteri Ürünleri için 2\nMarket Ürünleri için 3\nFiş Yazdırmak için 4\nÇıkış yapmak için 5");
        int secim = scan.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Yanlış bir giriş yaptınız. Tekrar deneyiniz!");
            girisEkrani();
        } else {
            switch (secim) {
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
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }
    }

    private static void cikis() {
        System.out.println("---------Çıkış Yapılıyor--------");System.exit(0);
    }

    private static void sarkuteri() {
        System.out.println("------- Şarküteri Reyonuna Hoşgeldiniz -------");
        System.out.println("Lütfen almak istediğiniz ürünün ürün ürün kodunu(UK) giriniz!");
        System.out.println("Kıyma fiyatı:250₺ UK:21n\nPeynir fiyatı:400₺ UK:22\nSüt fiyatı:120₺ UK:23\nYumurta fiyatı:90₺ UK:24\nYoğurt:100₺ UK:25" );

        while (!ekUrun)        {
            urunKodu=scan.nextInt();
            if(urunKodu>=21 && urunKodu<=25){
                System.out.println("Ne kadar alacaksınız(kg/lt/koli)");
                urunMiktari=scan.nextInt();
                switch (urunKodu){
                 case 21:
                   urunAdi="Kiyma";
                   urunFiyati=250;
                  System.out.println(urunMiktari +"kg "+ urunAdi+ "fiyati:"+ urunFiyati*urunMiktari+"TL'dir");
                  break;
                 case 22:
                     urunAdi="Peynir";
                     urunFiyati=400;
                      System.out.println(urunMiktari+"kg "+urunAdi+ "fiyati:"+ urunFiyati*urunMiktari+ "TL'dir");
                      break;
                 case 23:
                     urunAdi="Süt";
                     urunFiyati=120;
                     System.out.println(urunMiktari+"lt "+urunAdi+ "fiyati:"+ urunFiyati*urunMiktari+ "TL'dir");
                     break;
                    case 24:
                        urunAdi="Yumurta";
                        urunFiyati=90;
                        System.out.println(urunMiktari+"koli" +urunAdi+ "fiyati:"+ urunFiyati*urunMiktari+"TL'dir");
                        break;
                    case 25:
                        urunAdi="yogurt";
                        urunFiyati=90;
                        System.out.println(urunMiktari +" kg "+urunAdi+ "fiyati:" +urunFiyati*urunMiktari+ "TL'dir");
                        break;
       }
                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: " + toplam);
                sepet += urunAdi + ":fiyati " + urunFiyati +"₺";
                System.out.println(" Başka ürün almak ister misiniz? Eğer başka ürün almak isterseniz lütfen kodunu giriniz!" +
                        "\nAna Menüye dönmek için lütfen 0 (Sıfır) tuşuna basınız");


            } else if (urunKodu == 0) {
                girisEkrani();
        }
    }
}

    private static void fisYazdir() {
        System.out.println("------- Fiş Yazdırılıyor -------");
    }

    private static void market() {
        System.out.println("------- Market Reyonuna Hoşgeldiniz -------");
    }


    private static void manav() {
        System.out.println("------- Manav Reyonuna Hoşgeldiniz -------");
        System.out.println("Lütfen almak istediğiniz ürünün ürün ürün kodunu(UK) giriniz!");
        System.out.println("Elma Fiyatı: 25₺ UK: 11 \nYerli Muz Fiyatı: 40₺ UK: 12 \nDomates Fiyatı: 20₺ UK: 13 \nÇilek Fiyatı: 100₺ UK: 14 \nKarnabahar Fiyatı: 60₺ UK: 15");

        while (!ekUrun) {
            urunKodu = scan.nextInt();

            if (urunKodu >= 11 && urunKodu <= 15) {
                System.out.print("Kaç kg alacaksınız: ");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 11:
                        urunAdi = "Elma";
                        urunFiyati = 25;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;
                    case 12:
                        urunAdi = "Yerli Muz";
                        urunFiyati = 40;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + "TL'dir");
                        break;
                    case 13:
                        urunAdi = "Domates";
                        urunFiyati = 20;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı:" + urunFiyati * urunMiktari);
                        break;
                    case 14:
                        urunAdi = "Çilek";
                        urunFiyati = 100;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı:" + urunFiyati * urunMiktari);
                        break;
                    case 15:
                        urunAdi = "Karnabahar";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı:" + urunFiyati * urunMiktari);
                        break;
                }
                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;
                System.out.println("Oluşan Sepet Tutarı: " + toplam);
                sepet += urunAdi + ": " + urunFiyati + " TL dir\n";
                System.out.println(" Başka ürün almak ister misiniz? Eğer başka ürün almak isterseniz lütfen kodunu giriniz!" +
                        "\nAna Menüye dönmek için lütfen 0 (Sıfır) tuşuna basınız");


            } else if (urunKodu == 0) {
                girisEkrani();

            }
            }
        }

    }


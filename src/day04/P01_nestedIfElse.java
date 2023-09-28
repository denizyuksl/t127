package day04;

import java.util.Scanner;

public class P01_nestedIfElse {
    public static void main(String[] args) {
    /*
    1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
       Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
       KURALLAR
          : 1999 yılı 9. ay öncesi işe başlamış olmak
          : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
          : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
    */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen işe giriş tarihinizi yıl ve ay olarak 1999.09 şeklinde giriniz. ");
        double giris = scanner.nextDouble();
        if(giris>1999.09){
            System.out.println("EYT Kanun düzenlemesine tabi değilsiniz!");

        }else {
            System.out.println("Lütfen cinsiyetinizi K veya E olarak giriniz");
            char cinsiyet = scanner.next().charAt(0);
            System.out.print("Lütfen prim ödeme gün sayısını giriniz:  ");
            int primGun=scanner.nextInt();
            System.out.println("Lütfen hizmet yılınızı sürenizi giriniz:");
            int hizmetSuresi = scanner.nextInt();

            if (cinsiyet=='E'|| cinsiyet=='e');{
                if (primGun>=5500  && hizmetSuresi>=25){
                    System.out.println("Kanun yürürlüğe girdiği tarihte emekli olabilirsiniz");

                } else if (primGun<5500 && hizmetSuresi>=25) {
                    System.out.println("Emekli olabilmek için " + (5500- primGun)+ "gün primi ödemelisiniz.");

                } else if (primGun>=5500 &&hizmetSuresi<25) {
                    System.out.println("Emekli olabilmek için " +(25-hizmetSuresi)+ "yıl çalışmalısınız.");

                }else
                    System.out.println("Malesef henğz EYT şartlarının ikisini de sağlamıyorsunuz");
                    System.out.println("Hizmet süresi eksiği:"+(25-hizmetSuresi));
                    System.out.println("Eksik prim gün sayısı:"+(5500-primGun));

            }
            }





        }
    }
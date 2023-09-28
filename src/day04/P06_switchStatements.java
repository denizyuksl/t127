package day04;

import java.util.Scanner;

public class P06_switchStatements {
    public static void main(String[] args) {


        // Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen iki basamaklı bir sayi giriniz");
        int sayi = scan.nextInt();
        if (sayi>=10 && sayi<=99){
            int birlerbasamagi= sayi%10;
            int onlarbasamagi=sayi%10;

            switch (onlarbasamagi){
                case 1:
                    System.out.println("On");
                case 2:
                    System.out.println("Yirmi");
                case 3:
                    System.out.println("Otuz");
                    case 4:
                    System.out.println("Dört");
                case 5:
                    System.out.println("Beş");
                case 6:
                    System.out.println("Altı");

            }
        }
    }
}

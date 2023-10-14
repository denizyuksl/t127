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
            int onlarbasamagi=sayi/10;

            switch (onlarbasamagi){
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                    case 4:
                    System.out.print("Kırk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmış");
                    break;
                case 7:
                    System.out.print("Yetmiş");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;


            }switch (birlerbasamagi){
                    case 1:
                System.out.print("bir");
                break;
                    case 2:
                System.out.print("iki");
                break;
                    case 3:
                System.out.print("üç");
                    break;
                case 4:
                    System.out.print("dört");
                    break;
                case 5:
                    System.out.print("beş");
                    break;
                case 6:
                    System.out.print("altı");
                case 7:
                    System.out.print("yedi");
                    break;
                case 8:
                    System.out.print("sekiz");
                    break;
                case 9:
                    System.out.print("dokuz");
                break;
            }
        }
    }
}

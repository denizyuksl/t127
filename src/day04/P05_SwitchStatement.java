package day04;

import java.util.Scanner;

public class P05_SwitchStatement {
    public static void main(String[] args) {

        /*
         Kullanicidan bir rakam alip, rakami yaziyla yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz.(0-9 arasında)");
        int rakam = scan.nextInt();

        switch (rakam){
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                    break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz");


        }
    }
}

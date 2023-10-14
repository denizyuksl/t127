package day04;

import java.util.Scanner;

public class P09_Work {
    public static void main(String[] args) {
         /*
ÖDEV SORUSU- 20230923- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
"Simdi calisma zamani tatile .. gun var" seklinde hafta sonu tatiline kac
gun kaldigini yazdirin, girilen gun hafta sonu ise "Simdi dinlenme
zamani" yazdirin.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün adı giriniz");
        String gun = scan.next().toLowerCase();

        if (gun.equals("pazartesi")|| gun.equals("salı")|| gun.equals("çarşamba")|| gun.equals("perşembe")||gun.equals("cuma") ) {

            System.out.println("Şimdi çalışma zamanı tatile:" + (gun) + "var");


            } if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Şimdi dinlenme zamanı :");
        }else{
    }
        System.out.println("yanlış bir kelime girdiniz!");
    }
    }
        //BİR BİLENE SOOOOOOOORRRRR!!!
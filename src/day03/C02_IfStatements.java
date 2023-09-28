package day03;

import java.util.Locale;
import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {
        /*
        kullanıcıdan gün ismini alın ve haftaiçi veya haftasonu olduğunu yazdırın.
        Örn: gun=pazar output = "haftasonu" gun =sali output="haftaiçi"

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bugun gunlerden hangi gun: ");
        String gun = scan.next().toLowerCase();
        /*
        ||: veya (herhngi biri) or
        &&: ve (ikisi de) and
         */
        if (gun.equals("pazartesi")|| gun.equals("salı")|| gun.equals("çarşamba")|| gun.equals("perşembe")||gun.equals("cuma")){
            System.out.println("Bugün haftaiçi bir gün" +gun );
        }
        if (gun.equals("cumartesi") || (gun.equals("pazar"))){
            System.out.println("Bugün haftasonu bir gün:" +gun);
        }
        if (!(gun.equals("pazartesi")|| gun.equals("salı")|| gun.equals("çarşamba")|| gun.equals("perşembe")||gun.equals("cuma")
                ||(gun.equals("cumartesi") || (gun.equals("pazar")))))
            System.out.println("yanlış girdiniz!");
        }

        }






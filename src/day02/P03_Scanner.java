package day02;

import java.util.Scanner;

public class P03_Scanner {
    public static void main(String[] args) {

        // Bazen kod yazarken bazı variableler için kullanıcıdan değer almak gerekir.
        // bu gibi durumlarda SCANNER  classından yardım alınır.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz: ");
        String name = scan.nextLine();
        System.out.println("Lütfen soyadınızı giriniz: ");
        String surname =scan.nextLine();
        System.out.println("Adınız: "+name+" "+surname+" olarak kaydedildi.");
    }
}

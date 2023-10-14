package day05;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {


        /*
     Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
     dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
     baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
       */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen  başalngıç geğeripozitif tamsayı giriniz.");
        int başlangıçdeg = scan.nextInt();
        System.out.println("Lütfen bitiş değeri tamsayı giriniz.");
        int bitişdeg= scan.nextInt();
        int toplam=0;
        if (bitişdeg<başlangıçdeg){

            System.out.println("===== Başlangıç değeri bitiş değerinden büyük olamaz===");
        }else {
            for (int i = başlangıçdeg; i <=bitişdeg ; i++) {
                toplam+=i;

            }
        }
        System.out.println("Girdiğiniz aralıktaki sayıların toplamı"+toplam);
    }
}

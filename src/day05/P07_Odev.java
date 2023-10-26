package day05;

import java.util.Scanner;

public class P07_Odev {
    public static void main(String[] args) {


        // Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####
        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen satir sayisi giriniz" );
        int satir =scan.nextInt();
        System.out.print("Lütfen sutun sayisi giriniz");
        int sutun =scan.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 0; j <=sutun; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }


    }
}

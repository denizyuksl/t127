package day07;

public class P01_Odev {
          /*
        ÖDEV:
    Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
    olusturun. Eski array’i yeni haliyle kaydedin.
         */



    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10};

        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+2+" ");//4 6 8 10 12

        }
    }


}

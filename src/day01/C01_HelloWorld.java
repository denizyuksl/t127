package day01;

public class C01_HelloWorld {
    //nevfelYuksel
    // Ben bu java ile programlamayı en iyi şekilde yapacağım.
    //Öğrendikten sonra bununla çalışmalar yapacağım

    /*
    Bu şekilde yapılan yorumlarda
    istediğiniz kadar satırı yorum olarak ifade edebiliriz.

     */

    /*
    Programcılıgın temeli "Hello World" dür.
     */

    // Print Fonksiyonu
    //print fonksiyonu metinsel ifadelerin(String) ve diğer veri türlerini (variable)
    //metin olarak yazdırmasını sağlar.
    //bu fonksiyonda iki adet yazdırma olur.
    //println: yazdırıp bir sonraki satıra geçer işleme sonraki satırdan devam ettirir
    //print yazdırıp aynı satırda kalıp sonraki işlemi aynı satırdan devam ettirir.

    public static void main(String[] args) {
        //printtln Fonksiyonu
        System.out.println("Hello World");
        System.out.println("Hello Wise");




        //print Fonksiyonu
        System.out.print("Hello World -");
        System.out.print("Helllo Wise");

        /*Soru -1
        Konsola Hello World ve "Hello World" yazdırınız.
         */

        System.out.println("Hello World\t\" Hello Wise\"");

        /*
        \n : bir alt satırdan yazmaya başlar.
        \t : 1 TAB boşluk bırakır.
        \" :" yazar.
        \' :' yazar.
        \\ :\ yazar

         */

        System.out.println("Hello World\nHello Wise");//Hello World
        System.out.println("Hello\t World");
        System.out.println("Hello\\ World");
    }
}

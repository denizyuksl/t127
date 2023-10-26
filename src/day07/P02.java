package day07;

public class P02 {

    public static void main(String[] args) {

        System.out.println(P01.kutle);
        System.out.println(P01.yas);
       // System.out.println(P01.isim);P01 class'ında verilenlerden sadece static
        //olanlara ulaşabiliriz.


        P01 obj= new P01();
        System.out.println(P01.yas);
        System.out.println(P01.kutle);
        System.out.println(obj.isim);
        System.out.println(obj.soyisim);
        obj.isim="Nevfel";
        obj.soyisim="Yüksel";
        System.out.println(obj.isim);
        obj.isim="Tarik";
        System.out.println(obj.isim);

    }
}

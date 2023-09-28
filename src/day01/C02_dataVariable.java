package day01;

public class C02_dataVariable {
    public static void main(String[] args) {
        /* Java'da data türleri
        1:Primitive> ,int,char,boleen,long,dooble,float,byte,short.
        2:non-primitive>string...
        Bu data type'leri ile variable oluşturarak bu variable 'lara değer atayabiliriz.
         */
        String  name ="Nevfel";
        String surname ="Yüksel";
        String job = "student";
        int age =31;
        System.out.println("Adı: "+name+"\nSoyadı: "+surname+"\n Mesleği:"+job+"\n Yaşı: "+age);


        String name1= "Murat";
        String surname1="Babayigit";
        String job1 ="Instructor";
        int age1=44;
        System.out.print("Adı: +name1+ Soyadı:"+surname1+" Mesleği:"+job1+" Yaşı:"+age1);

        System.out.print("==============");
        String name3= "Ayca";
        System.out.println("name3 = " + name3);
        String surname3="ova";
        System.out.println("surname3 = " + surname3);
        String job3 ="Instructor";
        System.out.println("surname1 = " + surname1);
        int age3=34;
        System.out.println("age3 = " + age3);

    }
}

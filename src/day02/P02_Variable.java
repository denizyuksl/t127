package day02;

public class P02_Variable {
    public static void main(String[] args) {

        int a =12;
        int b= 23;
        int c=65;
        int d; // int variable değer atamamadan oluşturulur fakat değer atamadan kullanılmaz.
        d =100;

        System.out.println("Toplam: "+(a+b+c+d) );

        // d için değer atamazsak bu satır Compile Time Eror verir.
        // CTE  kodu yazarken henüz çalıştırılmadan farkedilen hatadır.
        // RTE kodu çalıştırınca ortaya çıkar. Run Eror Time

        String isim = "murat";
        String soyisim= "görgülü";
        System.out.println("İsim Soyisim ="+isim+ " " +soyisim);
        System.out.println("");
        System.out.println("İsim Soyisim: "+isim.toUpperCase().charAt(0)+". "+soyisim.toUpperCase());//M.GÖRGÜLÜ

        System.out.println("İsim Soyisim: "+isim.toUpperCase()+" "+soyisim.toUpperCase());

        String isim2="DENİZ";
        String soyisim2="YÜKSEL";
        System.out.println("İsim Soyisim:" +isim2.toLowerCase()+ " "+soyisim2.toLowerCase());


    }
}

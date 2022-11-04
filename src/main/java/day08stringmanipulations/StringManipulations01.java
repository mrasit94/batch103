package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        // exp1 kullanician aldigniz ismin ilk ve son harfini
        //ekrana yazdiriniz.
        // Ramazan ==> Rn

        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz...");
//        String isim = input.next();
//
//        // 1.yol
//        char ilkHarf = isim.charAt(0);
//        char sonHarf = isim.charAt(isim.length()-1);
//
//        System.out.println("" + ilkHarf + sonHarf);
        // yazdiginiz code sadece bazi durumlar icin calisirsa o code a "hard coding" denir
        //yazdiginiz code her durum icin calisirsa o code a "Dynamic coding" denir

        //2. yol

//        String ilk = isim.substring(0,1);
//        String son = isim.substring(isim.length()-1);

//        System.out.println(ilk + son);


        //ex2 verilen string deki sadece hayvan isimlerini ekrana yazdiriniz
        // "ben kedi esim tavuk oglum inek sever"

        String str = "ben kedi, esim tavuk, oglum sever inek";

        //substring() in iki kullanimi vardir.
        //1)substring(baslangic indexi, bitis indexi)
        // String'in ortasindan bir parca almaya yarar
        //2)substring(baslangic indexi) String'in verilen
        // index'ten sonuna kadar almaya yarar

        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek = str.substring(34);

        System.out.println(kedi + tavuk + inek);


        //Example 3: Ilk isim ve soy isimi iceren isimlerden ilk ve
        // soyisimlerin basharflerini ekrana yazdiriniz
        //           Ali Can ==> AC       Tahsin Yurdakul ==> TY

        System.out.println("Ilk ve soyisminizi giriniz.");

        String tamIsim = input.nextLine();
        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);

        System.out.println(a + b);
    }
}

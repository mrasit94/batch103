package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        // get the first name, middle name, lastname, SSN from the user then print them
        // like the following
        // Ali Mert Can
        //123456789
        Scanner input = new Scanner(System.in);
//1. yol
//        System.out.println("Ilk isminizi giriniz");
//        String ilkIsim = input.next();
//        //next() methodu kullanicidan String datasi almak icin kullanilir.
//
//        System.out.println("orta isminizi giriniz");
//        String ortaIsim = input.next();
//
//        System.out.println("soy isminizi giriniz");
//        String soyIsim = input.next();
//
//        System.out.println("Kimlik numaranizi giriniz");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkIsim + " " + ortaIsim + " " + soyIsim);
//        System.out.println(kimlikNo);

//2.yol

//        System.out.println("ilk orta ve soy isminizi ve kimlik numaranizi giriniz");
//        String ilk = input.next();
//        String orta = input.next();
//        String soy = input.next();
//        String kimlik = input.next();
//
//
//        System.out.println(ilk + " " + orta + " " + soy);
//        System.out.println(kimlik);

//3.yol

        System.out.println("ilk orta ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

        System.out.println(tamIsim);

        System.out.println("Kimlik numaranizi giriniz");
        String kimlikNumarasi = input.next();
        System.out.println(kimlikNumarasi);


    }
}

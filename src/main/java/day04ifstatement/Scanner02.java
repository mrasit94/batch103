package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //exp:kullanicidan ilk ve soy isminiz aliniz, ilk ve soyismin ilk harlerini yazdir
        Scanner input = new Scanner(System.in);
//1.yol
//        System.out.println("ilk isminizi giriniz");
//        char ilk = input.next().charAt(0);//a
//
//        System.out.println("soy isminizi giriniz");
//        char son = input.next().charAt(0);
//
//        System.out.println("" + ilk + son);
//2.yol
        System.out.println("tam isminizi giriniz");

        String tamIsim = input.nextLine(); //Ali Can
        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);
    }
}

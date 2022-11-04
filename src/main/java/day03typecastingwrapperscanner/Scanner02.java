package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    // exp1 sayilari kullanicidan alan ve toplama
    // islemi yapan kodu yaziniz.
    // 1. adim scanner clasindan obje olustur.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 2. adim kullaniciya ne yapacagini soyle

        System.out.println("ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble(); //sayiyi alip sayi1 in icine koyacak

        System.out.println("ikinci sayiyi giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);
    }
}

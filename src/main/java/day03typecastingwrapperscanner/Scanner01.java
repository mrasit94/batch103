package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //kullanicidan data almak icin yapilmasi gerekenler

        //1. step Scanner Classindan object olusturunuz
        Scanner input = new Scanner(System.in);

        //2. adim kullaniciya ne yapcagini soyle
        System.out.println("kullanici yasini gir!...");

        //3. adim kullanicidan aldiginiz bir datayi bir variablein icine koyun
        byte age = input.nextByte();

        System.out.println("hey kullanici senin yasin " + age);
    }
}

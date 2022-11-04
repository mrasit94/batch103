package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        //exp: kulkanicaidan alinan sayinin tek veya cift
        //oldugunu ekrana yazan kodu yaziniz.

        // 1.yol ideal degil
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int s = input.nextInt();

        if (s%2==0){
            System.out.println("cift sayi");
        }
        if (s%2!=0) {
            System.out.println("tek sayi");
        }

        // 2.yol

        if(s%2==0){
            System.out.println("cift sayi...");
        }
        else{
            System.out.println("tek sayi...");
        }
        // exp:2 sayi neg,poz,notr ise yazdir.

        System.out.println("bir sayi giriniz");
        double d = input.nextDouble();

        if(d>0){
            System.out.println("pozitif");
        }
        else if(d==0){
            System.out.println("notr");
        }
        else{
            System.out.println("negatif");
        }
    }
}

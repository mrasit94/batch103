package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        //exp1: kullanicidan gun isimlerini aliniz,
        // o gunun haftasonu mu hafta icimi oldugunu soyleyiniz.
        //pazatesi ==> haftaici
        //pazar==> haftasonu
        Scanner input   =  new Scanner(System.in);
        System.out.println("Bir gun ismi giriniz");
        String gun  = input.next();

        if(gun.equalsIgnoreCase("Pazar")){
            System.out.println("Haftasonu...");
        }
        else if(gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Haftaici...");
        }
        else if(gun.equalsIgnoreCase("Sali")){
            System.out.println("Haftaici...");
        }
        else if(gun.equalsIgnoreCase("Carsamba")){
            System.out.println("Haftaici...");
        }
        else if(gun.equalsIgnoreCase("Persembe")){
            System.out.println("Haftaici...");
        }
        else if(gun.equalsIgnoreCase("Cuma")){
            System.out.println("Haftaici...");
        }
        else if(gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Haftasonu...");
        }
        else{
            System.out.println("Gecerli Gun ismi giriniz " + gun);
        }

        // 2. yol kodu kisa yazmak tercih edilir.
        if (gun.equalsIgnoreCase("Pazar") ||
                gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("Hafta sonu");
        }
        else if(
                gun.equalsIgnoreCase("Pazartesi") ||
                        gun.equalsIgnoreCase("Sali") ||
                        gun.equalsIgnoreCase("Carsamba") ||
                        gun.equalsIgnoreCase("Persembe") ||
                        gun.equalsIgnoreCase("Cuma")){

            System.out.println("Hafta ici...");
        }
        else {
            System.out.println("Gecerli Gun ismi giriniz ");
        }


        //3. yol

        boolean haftaSonu =
                gun.equalsIgnoreCase("Pazar") ||
                gun.equalsIgnoreCase("Cumartesi");
        boolean haftaIci =
                gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma");
        if(haftaSonu){
            System.out.println("Hafta sonu");
        }else if(haftaIci){
            System.out.println("Hafta ici...");
        }else{
            System.out.println("Gecerli Gun ismi giriniz ");
        }

    }
}

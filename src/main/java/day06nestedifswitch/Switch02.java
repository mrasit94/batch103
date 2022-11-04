package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {
    /*
    kullanicidan ay ismi sorunuz ve kullanicinin verdigi
    ay isminden son aya kadar ekrana yazdiriniz
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay adi giriniz");
        String ayAdi = input.nextLine().toLowerCase();

        switch(ayAdi) {
            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("Subat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralik":
                System.out.println("aralik");
                break;
            default:
                System.out.println("Gecerli ay ismi giriniz");
        }

    }
}

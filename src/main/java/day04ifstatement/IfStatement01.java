package day04ifstatement;

public class IfStatement01 {

    public static void main(String[] args) {

        //exp1 sayi pozitif ise ekrana pozitif yazdirin.

        int s = 12;

        if(s>0){
            System.out.println("sayi pozitif");

        }
        //exp 2 verilen karakter buyuk harf ise ekrana"buyuk harf yazdirin"

        char ch = 'V';
        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");

        }
        // verilen bir sayi 3 basamakli ise ekrana 3 basamakli yazdiriniz.
        int n = -123;

        n = Math.abs(n); //matematik clasina git bana absolute degerini getir
        //n ye assign et
        if(n>99 && n<1000){
            System.out.println("Sayi uc basamakli");
        }
        // verilen sayi cift sayi ise ekrana cif yazdiriniz.
        int p = -18;

        //p = Math.abs(p); // javaya -18 i ikeye bolum cif deger verir
        // abs a gerek yok

        if(p%2==0){
            System.out.println("Cift");

        }
        // verilen sayi 300 kucuk veya 1200den buyuk ise harika yaz.
        int r = 300;

        if(r<300 || r>1200){
            System.out.println("Harika");
        }
    }
}

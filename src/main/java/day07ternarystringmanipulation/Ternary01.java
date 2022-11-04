package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        // bir sayinin pozitif olup olmadigini ekrana
        // yazdiran kodu yaziniz.


        //1.way if-else
        int a = -12;
        if(a>0){
            System.out.println("pozitif");
        }else{
            System.out.println("Pozitif degil");
        }

        //2.way ternary

        // if yok parantez yok, sadec kosul

        String sonuc = a>0 ? "Pozitif" : "Pozitif degil";
        System.out.println(sonuc);

        // eger kosul (a>0)  dogruysa (?) ilk bolumu calisir (Pozitif)
        // kosul yanlis ise : tadan sonraki kisim calistirilir.


        // 2 sayidan kucuk olan i secen kodu yaziniz
        int b = 120;
        int c = 23;

        int min = b<c ? b : c;
        System.out.println(min);

        // verilen bir sayiynin mutlak degerini hesaplayan
        // pozitifler ve sifirin degeri kendileri
        // negatiflerin - ile carpimlari

        int d = -45;

        int abs = d<0 ? d*-1 : d;
        System.out.println(abs);

        // iki tane sayi ayni isaretli ise bu sayilari carpiniz
        // farkli isaretli ise islem yapamam yazdirin.

        int e = 12;
        int f = -10;

        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "Islem Yapamam";
        System.out.println(islem);
        // resultlardan biri int diger string o yuzden ust class olan
        //object clasini container olarak kullandik !!!
        // javada her classin en az 1 tane parenti vardir, parenti olmayan tek class
        // object classidir.

    }
}

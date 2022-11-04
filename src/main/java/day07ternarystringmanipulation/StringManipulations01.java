package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {

        /*
        String Class Methodlari
        1) equals(): i) iki stringin ayni olup olmadigini anlamamiza yarrar
                    ii) equals() methodu boolean return eder.
        2) equalsIgnoreCase(): i) 2 stringing ayni olup olmadigini buyuk/kucuk
                                harfe dikkat etmeden kontrol eder.
                              ii) boolean return eder.
        3) toLowerCase(): i) Bir string teki tum harfleri kucuk harfe cevirmek
                           icin kullanilir.
                         ii) String return eder.
        4) toUpperCase(): i) Bir string teki tum harfleri buyuk harfe cevirmek
                           icin kullanilir.
                         ii) String return eder.
        5) charAt(): i) Bir stringden belli bir indexteki characteri almak icin
                    kullanilir.
                    ii) charAt() methodu char return eder.
        6) length(): i) Bir stringde kac tane character kullanildigini ogrenmek
                     icin kullanilir.
                    ii) length methodu int return eder.
        7) contains(): i) Bir stringde belli bir characterin veya characterelerin
                        var olup olmadigini anlamak icin kullanilir.
                      ii) contains() methodu boolena return eder.
        8) split(): i) Bir stringi istedigimiz characterden parcalamaya yarar.
                   ii) split() methodu array return eder.

         */

        /*
        Bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol
        eden kodu yaziniz.

        i) en az 8 karakter icermeli
        ii) space olmamali
        iii) ilk harfi "M" veya "m" harf olmali
        iv) son karakteri "?" olmali
         */
        String pwd = "Manisa12?";
        //i)
        boolean first = pwd.length()>7;

        //ii)
        boolean second = !pwd.contains(" ");

        //iii) M m
        boolean third = pwd.charAt(0)=='M'|| pwd.charAt(0)=='m';

        //iv) last ?

        boolean fourth = pwd.charAt(pwd.length()-1)=='?';
    //pwd.length()-1 son harf demek cunku indez num= length-1
        System.out.println(first && second && third && fourth);
    }
}

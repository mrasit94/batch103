package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {

    public static void main(String[] args) {

        int a =5;

        // Post Increment =java sonra artirma yapar

        int b = a++;//java once a ile b yi gorur

        System.out.println(b );//5//neden 5 yazdi?java anlamli bi cumle duydugunde hemen uygular
        // java int b=a gorunce direk 5 uygular.daha artirmaya gelmeden manayi kavradi

        System.out.println(a);//6 neden 6.cunku az once acele etti 6 oldugunu sonradan farketti


        //pre increment//once artirir

        int c=10;

        int d=++c;//java d ile ++ lari onceden gorur ve toplam olacagini anlar ve islemi yapar
        //once + isaretini gordugu icin sonucu dogru verir
        System.out.println(d);//11
        System.out.println(c);//11


        //Post Decrement >>>sonradan gorup yazdirir.

        int e=20;

        int f=e--;//ayni yukardaki mantikla bunda da acele eder ve 20yi yapistirir

        System.out.println(f);//20

        System.out.println(e);//19



        //Pre Decrement >>onceden gorur ve yazdiriri

        int h =30;

        int i =--h;

        System.out.println(i);//29
        System.out.println(h);//29
    }
}

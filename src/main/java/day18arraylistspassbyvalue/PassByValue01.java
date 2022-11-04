package day18arraylistspassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {
/*
        1)Java, variable'ların orijinal değerlerini korumak ister.

        2)Variable metotlar içinde kullanıldığında, Java metodun içine
        orijinal değer koymaz, o değerin kopyasını üretir ve metoda o kopyayı yollar.
        Metot kopya üstünde değişiklik yapar, dolayısıyla variable'ın
        orijinal değer korunmuş olur.
        Bu sisteme "PassByValoue" denir.
        Note: Java "Pass By Value " kullanir."Pass By Reference "kullanmaz.
             Bazi programlama dilleri orjinal degeri koruma altina almamistir.
            Bu isi developer lara birakmistir. Bu tarz diller "Pass By Reference " kullanir.


 */
        int x = 5;//gomlek
        System.out.println(x);//5
        //static method olan "main method' un icindeki her sey
        // static olmalidir.

        change(x);//ogrenci gomlegi

        System.out.println(x);//5 gomlek

        int ucret=100;

        ucret=indirim(ucret);

        System.out.println(ucret);//90

    }

    public static void change(int a) {

        System.out.println(a * 3);

    }

    //void disindaki "return"type larda method bpdy si icinde
    //"return" keyword kullanilmalidir.
    public static int indirim(int gomlekUcreti) {

        return gomlekUcreti-10;

    }
}

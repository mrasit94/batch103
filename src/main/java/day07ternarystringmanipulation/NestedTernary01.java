package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
        verilen yilin "Leap year (artik yil) olup olmadigini
        kontrol eden kodu yaziniz."

        i) yil 100e bolunurse 400e de bolunmelidir. 1600+ 1800-
        ii) yil 100 e bolunmezse 4 e bolunmelidir. 1996+ 2001-
         */

        int year = 2022;

        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") :
                (year%4==0 ? "Leap year" : "Leap year degil" );
        System.out.println(leap);

        // asagidaki kurallara gore passwordun gecerli olup olamdigini
        //kontrol eden kodu yaziniz
        // 8 karakterden fazla veya 8 karakter varsa ilk harfi i olmalidir
        // 8 karakterden az karakter varsa K olmalidir

        //gorev verildigin de her zaman yukarda nasagi gitmek zorunda degisliniz
        //bu gorevi yazan developer degildir, kod bilmeyebilirler.
        // o yuzden once sondaki mi yoksa ilk olan kosulu yapmak
        //kodu yazana kalmis, hangisi kolay yontem se ordan baslanir.


        String pwd = "ikkkkkkkkk2a3e4";

        char ilkHarf = pwd.charAt(0);
        String gecerli =  ilkHarf<8 ?
                (ilkHarf=='K' ? "Gecerli Password" : "Gecersiz password") :
                (ilkHarf=='i' ? "Gecerli p" : "Gecersiz p");
        System.out.println(gecerli);
    }
}

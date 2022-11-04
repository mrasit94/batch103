package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
        1. Farkli sayilardaki parametrelerle chalishabilen bir method olushturmak isterseniz "varargs" kullanmalisiniz.

        2. varargs arka tarafta array kullanır, bu yüzden "varargs" larla çalışırken "Array"lerle çalışıyormuş gibi davranabilirsiniz.

        3."varargs" olusturmak icin "<data type >...  <varargs ismi>"
         veya  "<data Type>  ...<varargs ismi>"

        4. bir method da "varargs" yaninda bashka bir parametre kullanilabilir mi?
        -"varargs" en sonda olmak sarti ile kullanilir.

        5)Bir method'da birden fazla "varargs" kullanilabilir mi?
        "varargs" en sonda olmak zorunda oldugundan birden fazla
        kullanirsaniz en az biri en sonda olmayacaktir. Bu da
        4. kural ile celisir.

         */


    public static void main(String[] args) {
//
//        int r1 =add(2,3);
//        System.out.println(r1);//5
//
//        int r2 =add(2,3,4);
//        System.out.println(r2);//9
//
//        int r3 =add(2,3,4,5,6,7,8,9);
//        System.out.println(r3);//44

    }

    //iki sayinin toplamini return eder method u olusturunuz

//    public static int add(int a, int b) {
//        return a + b;
//    }
    //uc sayinin toplamini return eder method u olusturunuz

//    public static int ikiSayiTopla(int a, int b, int c) {
//        return a + b + c;
//    }
    //dort sayinin toplamini return eder method u olusturunuz
//
//    public static int ucSayiTopla(int a, int b, int c, int d) {
//        return a + b + c + d;

    //istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim

    public static  int add (int ...a){  //(int...a) varargs'tir dipsiz kuyu gibidir

        int sum = 0;

        for(int w : a){

            sum = sum +w ;

        }
        return sum;

    }
}

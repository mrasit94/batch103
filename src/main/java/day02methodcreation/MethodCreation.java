package day02methodcreation;

public class MethodCreation {
    public static void main(String[] args) {
        System.out.println(toplamaYap(1.2,5));
        System.out.println(ucSayiyiCarp(2,1.5,6));
        System.out.println(ucSayiydanIlkIkiyiToplaUcuncuIleCarp(2,8,3.2));


    }
    public static double toplamaYap(double a, double b){
        return a+b;
    }
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }
    public static double ucSayiydanIlkIkiyiToplaUcuncuIleCarp(double a, double b, double c) {
        return (a + b) * c;
    }
}

package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        Car myHonda = new Car();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt(); //bu zaten yazi yazdiriyor bir daha printe'e gerek yok//
        myHonda.dur();


        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));
    }

    public void hareketEt(){
        System.out.println("Honda guzel hareket eder ...");
    }

    public void dur(){
        System.out.println("Honda guvenli durur...");
    }


}

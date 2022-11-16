package day28abstraction;

public abstract class Animal {

    //body'si olmayan methodlar "abstract method" olarak adlandirilir.
    //Bir methodu abstract yapmak icin;  i)Method body'i sil  ii)"Abstract" keyword'u kullan.
    //"abstract method" lar :abstract class" icinde olmalidir.
    public abstract void eat();

    //"abstract class" larda hem "abstract" hem de "concrete" method(non-abstract) kullanilabilir.
    public void drink(){
        System.out.println("Animals drink");
    }

    //abstract "move" method olusturunuz.

    public abstract void move();
}

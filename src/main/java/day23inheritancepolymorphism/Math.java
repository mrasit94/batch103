package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practice(){
        System.out.println("Solve questions");
    }
    public Math(){
        super("xxx");
        System.out.println("Constructor1");
    }
    public Math(int a){
        this(); // ayni classin icinde diger constructoru kullan
        System.out.println("Constructor2");
    }
}

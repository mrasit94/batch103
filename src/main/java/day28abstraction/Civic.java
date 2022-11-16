package day28abstraction;

public class Civic implements Engine, Ac, Hood{//Bir Class'i bir interface'in child'i yapmak icin "implements" kullaniriz


    @Override
    public void eco() {
        System.out.println("Uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("Uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("Uses tsi");
    }

    @Override
    public void Digital() {
        System.out.println("Uses digital AC");

    }

    @Override
    public void climate() {
        System.out.println("Uses climate technology");

    }

    @Override
    public void steel() {
        System.out.println("Hood is made of steel");
    }
}

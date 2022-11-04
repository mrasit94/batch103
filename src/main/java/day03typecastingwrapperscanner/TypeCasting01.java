package day03typecastingwrapperscanner;

public class TypeCasting01 {
    public static void main(String[] args) {
        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents;

        float price = 12.99F;
        byte newPrice = (byte)price;
        System.out.println(newPrice);

        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber);

        int num = 510;
        byte newNum = (byte)num;
        System.out.println(newNum);


    }
}

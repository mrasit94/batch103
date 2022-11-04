package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        // kullanicidan gun sayisini aliniz gun ismini veriniz
        //1==> pazar
        Scanner input = new Scanner(System.in);
        System.out.println("Gun numunu giriniz");
        byte gunNo = input.nextByte();

        //1. yol if ile cozunuz
        if(gunNo==1){
            System.out.println("Pazar");
        }else if(gunNo==2){
            System.out.println("Pazartesi");
        }else if(gunNo==3) {
            System.out.println("Sali");
        }else if(gunNo==4){
            System.out.println("Carsamba");
        }else if(gunNo==5){
            System.out.println("Persembe");
        }else if(gunNo==6){
            System.out.println("Cuma");
        }else if(gunNo==7){
            System.out.println("Cumartesi");
        }else {
            System.out.println("Gecerli sayi giriniz...");
        }
        //2. yol Switch ile cozunuz
        switch(gunNo){
            case 1:
                System.out.println("Pazar");
                break;
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Carsamba");
                break;
            case 5:
                System.out.println("Persembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default:
                System.out.println("Gecerli gun giriniz");
        }
    }
}

package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{

    //Checking hesap islemleri

    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$###,##0.00");

    boolean flag = true;

    HashMap<Integer, Integer> data = new HashMap<>();

    public void login(){

        System.out.println("ATM e hos geldiniz");

        do {
            data.put(12345, 1234);
            data.put(23456, 2345);
            data.put(34567, 3456);
            data.put(45678, 4567);

            try{
                System.out.println("hesap numaranizi giriniz");
                setAccountNumber(input.nextInt());
                System.out.println("Pin numaranizi giriniz");
                setPinNumber(input.nextInt());

            }catch (Exception e){

                System.out.println("Yanlis karakter girdiniz. lutfen sadece rakam giriniz." +
                        "veya Q ya basip cikabilirsiniz");

                input.nextLine();
                String exit = input.next();

                if(exit.equalsIgnoreCase("q")) {
                    flag = false;
                }
            }

            int count = 0;

            for(Map.Entry<Integer, Integer> w: data.entrySet()){
                if(w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber()) ){

                    getAccountTypes(); // hesap islemlerine gidiniz
                }else {
                    count++;
                }
            }

            if(count == data.size()){
                System.out.println("yanlis hesap numarasi veya pin numarasi girdiniz");
            }
        }while (flag);

    }






    public void checkingOperations(){

        do {
            displayMessage();

            int option = input.nextInt();

            if(option == 4){
                break;
            }

            switch (option){
                case 1:
                    System.out.println("Checking hesabinizda kalan bakiye" + moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("yanlis secenek lutfen 1, 2, 3 veya 4 u kullaniniz");

            }

        }while (true);

        getAccountTypes();
    }

    // vadeli hesap islemleri
    public void savingOperations(){

        do {
            displayMessage();

            int option = input.nextInt();

            if(option == 4){
                break;
            }

            switch (option){
                case 1:
                    System.out.println("Saving hesabinizda kalan bakiye" + moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("yanlis secenek lutfen 1, 2, 3 veya 4 u kullaniniz");

            }
        }while(true);

        getAccountTypes();

    }
    // ilgili hesabi seciniz
    public void getAccountTypes(){

        System.out.println("Islem yapmak istediginiz hesabi seciniz");
        System.out.println("1: Checking Account");
        System.out.println("2: Saving Account");
        System.out.println("3: Exit");

        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("Checking hesabinizdasiniz");
                checkingOperations();
                break;
            case 2:
                System.out.println("Saving hesabinizdasiniz");
                savingOperations();
                break;
            case 3:
                System.out.println("ATM makinemizi kullandiginiz icin tesekkur ederiz");
                flag = false;
            default:
                System.out.println("yanlis secenek. Lutfen 1,2 veya 3u kullaniniz");


        }
    }

    //kisi icin secenekleri goruntule
    public void displayMessage(){
        System.out.println("Option seciniz!");
        System.out.println("1: View Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Exit");
    }
}

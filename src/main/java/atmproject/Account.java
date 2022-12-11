package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int pinNumber;

    private double checkingBalance;
    private double savingBalance;

    DecimalFormat moneyFormat = new DecimalFormat("'$###,##0.00");

    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    private double calculateCheckingBalanceAfterWithdraw(double amount){
        checkingBalance = checkingBalance - amount;

        return checkingBalance;
    }

    private double calculateCheckingBalanceAfterDeposit(double amount){
        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance = savingBalance - amount;

        return savingBalance;
    }

    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    // musteri ile para cekmek icin etkilesim > checking
    public void getCheckingWithdraw(){
        displayCurrentAmount(checkingBalance);
        System.out.println("Enter the withdraw amount: ");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println("0 or - amounts are invalid");
            getCheckingWithdraw(); // recursive method, methodu tekrardan cagirma.
        }else if(amount <= checkingBalance){

            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        }else {
            System.out.println("Insufficient balance");
        }

    }

    // musteri ile para yatirmak icin etkilesim > checking
    public void getCheckingDeposit(){
        displayCurrentAmount(checkingBalance);
        System.out.println("yatirilmak istenen miktari giriniz: ");
        double amount = input.nextDouble();

        if(amount <= 0 ){
            System.out.println("0 or - amounts are invalid");
            getCheckingDeposit();

        }else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }
    }

    // musteri ile para cekmek icin etkilesim > saving

    public void getSavingWithdraw() {
        displayCurrentAmount(savingBalance);
        System.out.println("Enter the withdraw amount: ");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println("0 or - amounts are invalid");
            getSavingWithdraw(); // recursive method, methodu tekrardan cagirma.
        }else if(amount <= savingBalance){

            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }else {
            System.out.println("Insufficient balance! ");
        }
    }

    // musteri ile para yatirmak icin etkilesim > saving acc
    public void getSavingDeposit(){
        displayCurrentAmount(savingBalance);
        System.out.println("yatirilmak istenen miktari giriniz: ");
        double amount = input.nextDouble();

        if(amount <= 0 ){
            System.out.println("0 or - amounts are invalid");
            getSavingDeposit();

        }else {
            calculateSavingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }
    }

    //sonraki bakiyeyyi goster
    public void displayCurrentAmount(double balance){
        System.out.println("Amount you have in your acc: " + moneyFormat.format(balance));

    }

}

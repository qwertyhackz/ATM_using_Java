import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###, ##0.00");

    //set Customer Number
    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    //get Customer Number
    public int getCustomerNumber() {
        return customerNumber;
    }

    //set Pin
    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    //get Pin
    public int getPinNumber() {
        return pinNumber;
    }

    //Checking Account Balance
    public double getCheckingBalance() {
        return checkingBalance;
    }

    //Saving Account Balance
    public double getSavingBalance() {
        return savingBalance;
    }

    //Calculating Checking account withdrawal
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    //Calculating Saving account withdrawal
    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }


//Checking withdraw
    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account Balance is : " + moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you want to withdraw from Checking Account: \n");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Balance is: " + moneyFormat.format(checkingBalance));
        } else System.out.println("You are exceeding your limit.\n");
    }
    //Saving withdraw
    public void getSavingWithdrawInput() {
        System.out.println("Saving Account Balance is : " + moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you want to withdraw from Saving Account: \n");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Balance is : " + savingBalance +"\n");
        } else System.out.println("Balance cannot be negative: \n");

    }


    //Calculating Checking account deposit
    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    //Calculating Saving account deposit
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }


    //Checking Deposit
    public void getCheckingDepositInput() {
        System.out.println("Checking Account Balance is : " + moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you want to Deposit to Checking Account: ");
        double amount = input.nextDouble();
    if((checkingBalance+amount)>=0){
        calcCheckingDeposit(amount);
        System.out.println("Your new Checking Balance is : " +moneyFormat.format(checkingBalance));
    }else{System.out.println("Balance cannot be negative : \n");}
    }

    //Saving withdraw
public void getSavingDepositInput(){
        System.out.println("Saving Account Balance is : "+moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you want to Deposit to the Savings Account : ");
        double amount = input.nextDouble();
    if((savingBalance+amount)>=0){
        calcSavingDeposit(amount);
        System.out.println("Your new Saving Balance is : "+moneyFormat.format(savingBalance));}
    else{System.out.println("Balance cannot be negative\n");}
    }
}
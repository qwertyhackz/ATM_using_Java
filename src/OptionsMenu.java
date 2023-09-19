//Main class

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;

public class OptionsMenu extends Accounts {

    int selection;
Scanner menuInput= new Scanner(System.in);
DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");

   HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

   public void getLogin() throws IOException{
       int x=1;
       do {
           try{
               data.put(101977, 2006);
               data.put(101996, 1996);
               data.put(102000, 1901);
               data.put(102001, 2712);

           System.out.println("Welcome to the ATM");

               System.out.println("Enter the account number: ");
               setCustomerNumber(menuInput.nextInt());

               System.out.println("Enter your Pin number: ");
               setPinNumber(menuInput.nextInt());}
               catch(Exception e){
                   System.out.println("Invalid character(s).Only numbers.\n");
                   x=2;}

for (Entry<Integer, Integer> entry:data.entrySet()){
    if(entry.getKey()==getCustomerNumber()&&entry.getValue()==getPinNumber()){
        getAccountType();} }

               System.out.println("Wrong Customer number or Pin Number");
           }while(x==1);
       }

public void getAccountType(){
           System.out.println("Select the Account you want to access");
           System.out.println("1 - Checking Account");
           System.out.println("2 - Savings Account");
           System.out.println("3 - Exit");
           System.out.print("Type your choice ");

           selection = menuInput.nextInt();

           switch (selection){
               case 1:
                   getChecking();
                   break;

               case 2:
                   getSaving();
                   break;
               case 3:
                   System.out.println("Thank you for using our ATM.");
                   break;
               default:
                   System.out.println("Invalid choice" + "\n");
                   getAccountType();
           }
       }

       //Checking Account with options.
public void getChecking() {
           System.out.println("Checking Account");
           System.out.println("1 - View Balance");
           System.out.println("2 - Withdraw Funds");
           System.out.println("3 - Deposit Funds");
           System.out.println("4 - Exit");
           System.out.print("Type your choice ");
           selection = menuInput.nextInt();

           switch (selection) {
               case 1:
                   System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                   getAccountType();
                   break;

               case 2:
                   System.out.println("Enter the Amount to withdraw: ");
                   getCheckingWithdrawInput();
                   getAccountType();
                   break;
               case 3:
                   System.out.println("Enter the deposit amount: ");
                   getCheckingDepositInput();
                   getAccountType();
                   break;
               case 4:
                   System.out.println("Thank you for using this ATM, Good day.");
                   break;
               case 5:
                   System.out.println("Invalid choice\n");
                   getChecking();
           }
       }

    //Saving Account with options.
    public void getSaving(){
        System.out.println("Savings Account");
        System.out.println("1 - View Balance");
        System.out.println("2 - Withdraw Funds");
        System.out.println("3 - Deposit Funds");
        System.out.println("4 - Exit");
        System.out.println("Type your choice ");
        selection = menuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;

            case 2:
                System.out.println("Enter the Amount to withdraw: ");
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                System.out.println("Enter the deposit amount: ");
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using this ATM, Good day.");
                break;

            case 5:
                System.out.println("\nInvalid choice\n");
                getSaving();

        }}
}




package ATM;

import java.util.Scanner;

public class UserInterface {
    private static int status;
    public static void main(String[] args){

        Atmoperation Ap = new Atmoperation();
        Scanner scan = new Scanner(System.in);
        int atmnumber = 99893468;
        int atmpin = 7184;
        System.out.println("WELCOME TO THE E.V.R ATM SERVICES");
        System.out.println("ENTER THE ATM NUMBER : ");
        int atmnum = scan.nextInt();
        System.out.println("ENTER THE ATM PIN :");
        int pin = scan.nextInt();
        if(atmnumber == atmnum && atmpin == pin){
            while(true) {
                System.out.println("1.CheckBalance\n 2.WithdrawAmount\n 3.DepositAmount\n 4.ViewMiniStatement\n 5.Exit");
                System.out.print("Enter your choice :");
                int ch = scan.nextInt();
                switch (ch) {
                    case 1:
                        Ap.viewBalance();
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        double withdrawAmount = scan.nextDouble();
                        Ap.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Enter amount to deposit:");
                        double depositAmount = scan.nextDouble();
                        Ap.depositAmount(depositAmount);
                        break;
                    case 4:
                        Ap.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Collect your ATM Card\nThank you for using ATM  ");
                        scan.close();
                        System.exit(status);
                    default:
                        System.out.println("Please enter a correct choice");
                }
            }
        }else{
            System.out.println("INCORRECT ATM NUMBER OR PIN");
        }
    }
}

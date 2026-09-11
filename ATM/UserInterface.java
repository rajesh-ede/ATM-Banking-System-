package ATM;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Atmoperation Ap = new Atmoperation();
        Scanner scan = new Scanner(System.in);

        String atmnumber = "1234567890";
        int atmpin = 7184;


        System.out.println(" WELCOME TO ATM SERVICES \n");
//        System.out.println("\n");

        System.out.print("ENTER THE ATM NUMBER : ");
        String atmnum = scan.next();

        System.out.print("ENTER THE ATM PIN : ");
        int pin = scan.nextInt();

        if (atmnumber.equals(atmnum) && atmpin == pin) {

            System.out.println("\nLogin Successful!");

            while (true) {

                System.out.println("\n--------- ATM MENU ---------");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit");
                System.out.println("----------------------------");

                System.out.print("Enter your choice : ");
                int ch = scan.nextInt();

                switch (ch) {

                    case 1:
                        Ap.viewBalance();
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw : ₹");
                        double withdrawAmount = scan.nextDouble();

                        Ap.withdrawAmount(withdrawAmount);
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit : ₹");
                        double depositAmount = scan.nextDouble();

                        Ap.depositAmount(depositAmount);
                        break;

                    case 4:
                        Ap.viewMiniStatement();
                        break;

                    case 5:
                        System.out.println("\nCollect your ATM Card.");
                        System.out.println("Thank you for using ATM!");
                        return;

                    default:
                        System.out.println("Please enter a correct choice.");
                }
            }

        } else {
            System.out.println("\nINCORRECT ATM NUMBER OR PIN");
        }
    }
}

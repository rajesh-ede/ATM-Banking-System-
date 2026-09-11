package ATM;

import java.util.*;

public class Atmoperation implements AtmInterface{

    atm Atm = new atm();
    List<String> mini = new ArrayList<>();

    @Override
    public void viewBalance() {
       System.out.println("Available Balance :  ₹" + Atm.getBalance() );
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {

        if (withdrawAmount <= 0) {
            System.out.println("Please enter a valid amount.");
            return;
        }


        if (withdrawAmount % 100 != 0) {
            System.out.println("Please enter amount in multiples of 100.");
            return;
        }

        if (withdrawAmount <= Atm.getBalance()) {

            Atm.setBalance(Atm.getBalance() - withdrawAmount);
            Atm.setWithdraw(withdrawAmount);

            System.out.println("Please collect your cash : ₹" + withdrawAmount);


            mini.add("Withdrawn : ₹" + withdrawAmount);


            viewBalance();

        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {

        if (depositAmount <= 0) {
            System.out.println("Please enter a valid amount.");
            return;
        }

        Atm.setBalance(Atm.getBalance() + depositAmount);
        Atm.setDepositAmount(depositAmount);

        System.out.println("Amount Deposited : ₹" + depositAmount);
        mini.add("Deposited : ₹" + depositAmount);
        viewBalance();
    }
    @Override
    public void viewMiniStatement() {

        System.out.println("\n------ MINI STATEMENT ------");

        if (mini.isEmpty()) {
            System.out.println("No transactions available.");
        } else {

            for (String transaction : mini) {
                System.out.println(transaction);
            }
        }

        System.out.println("----------------------------");
        System.out.println("Available Balance : ₹" + Atm.getBalance());
    }
    }

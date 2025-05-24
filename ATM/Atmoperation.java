package ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Atmoperation implements AtmInterface{

    atm Atm = new atm();
    Map<Double,String> mini = new HashMap<>();

    @Override
    public void viewBalance() {
       System.out.println("Availablebalance : " + Atm.getBalance() );
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
    if(withdrawAmount % 100 == 0){
        if(withdrawAmount <= Atm.getBalance()){
          System.out.println("Grab the cash"+ withdrawAmount);
          Atm.setBalance(Atm.getBalance()-withdrawAmount);
          mini.put(withdrawAmount,"Amount has been debited");
          viewBalance();
        }else{
            System.out.println("Insufficient Balance");
        }

    }else{
        System.out.println("Enter amount in terms of 500");
    }
    }

    @Override
    public void depositAmount(double depositAmount) {
    System.out.println("depositAmount is : " + depositAmount);
        Atm.setBalance(Atm.getBalance()+depositAmount);
        mini.put(depositAmount,"deposited Successfully");
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
     Set<Double> set = mini.keySet();
     for(Double d : set){
      System.out.println(d+"="+mini.get(d));
     }
    }
}

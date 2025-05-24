package ATM;

public class atm {
    private double  Balance;
    private double depositAmount;
    private double withdraw;

    public atm() {
        super();
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    @Override
    public String toString() {
        return "atm{" +
                "Balance=" + Balance +
                ", depositAmount=" + depositAmount +
                ", withdraw=" + withdraw +
                '}';
    }
}


package courses.abstractbanking;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public boolean withdraw(double amount) {
        return false;
    }

    @Override
    public String getDescrption() {
        return "Savings Account";
    }
}

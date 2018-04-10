package courses.abstractbanking;

public class Customer {

    private String firstName;
    private String lastName;
    private Account[] accounts;
    private int numberOfAccounts;

    public Customer(String firsName, String lastName) {
        this.firstName = firsName;
        this.lastName = lastName;
        accounts = new Account[10];
        numberOfAccounts = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account acct) {
        //System.out.println(numberOfAccounts);
        int i = numberOfAccounts++;
        //System.out.println(numberOfAccounts);
        accounts[i] = acct;
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public Account getAccount(int accountIndex) {
        return accounts[accountIndex];
    }

    public Account[] getAccounts() {
        return accounts;
    }
}

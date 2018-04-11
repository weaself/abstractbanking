package courses.abstractbanking;

public class AbstractBankingMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer;
        Customer customer2;

        bank.addCustomer("Jane", "Doe");
        customer = bank.getCustomer(0);
        customer.addAccount(new CheckingAccount(500.00));
        customer.addAccount(new SavingsAccount(200.0));
        System.out.println("The customer has: " + customer.getNumberOfAccounts() + " accounts.");

        bank.addCustomer("John", "Smith");
        customer2 = bank.getCustomer(1);
        customer2.addAccount(new CheckingAccount(500.00));
        customer2.addAccount(new SavingsAccount(200.0));
        System.out.println("The customer has: " + customer2.getNumberOfAccounts() + " accounts.");

       // customer.getAccount(0);

//        for (int i = 0; i < customer.getNumberOfAccounts(); i++) {
//            System.out.println(customer.getAccount(i).toString());
//            System.out.println("Current index: " + i);
//        }

        System.out.println(customer.getAccounts().length); // check the length
        System.out.println(bank.getNumberOfCustomers());

        Customer custReference = bank.getCustomer(0);
        System.out.println(custReference.getFirstName());

         for (Customer custom : bank.getAllCustomers()) {
             System.out.println(custom.getFirstName() + "'s number of accounts: " + custom.getNumberOfAccounts());
             System.out.println(custom.getFirstName() + "'s id: " + custom.getCustomerID());
         }

         Storage storage = new Storage(customer.getFirstName(), customer.getLastName());



    }

}

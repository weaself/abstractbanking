package courses.abstractbanking;

import java.util.ArrayList;

public class Bank {

    ArrayList <Customer> customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new ArrayList<Customer>();
        numberOfCustomers = 0;
    }

    public void addCustomer(String firstName, String lastName){
        int i = numberOfCustomers++;
        customers.add(new Customer(firstName, lastName));
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int customerIndex) {
        try {
            return customers.get(customerIndex);
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("This is a bad index!");
            return null;
        }
    }

    public ArrayList<Customer> getAllCustomers() {
        return customers;
    }

}

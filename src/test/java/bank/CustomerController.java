package bank;

import java.util.ArrayList;
import java.util.Date;

public class CustomerController extends Customer {

    public CustomerController(int customerID, Date accountOpeningDate, String account) {
        super(customerID, accountOpeningDate, account);
    }
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public int addAccount(Customer customer){
        customers.add(customer);
        return customer.getCustomerID();
    }
}

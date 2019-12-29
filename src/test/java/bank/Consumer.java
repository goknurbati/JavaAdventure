package bank;

import java.util.Date;

public class Consumer extends Customer{

    private String customerFullName;

    public Consumer(){
        super(customerID,accountOpeningDate,account);
        this.customerFullName=customerFullName;
    }
    public String getCustomerFullName() {
        return customerFullName;
    }
    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }
}

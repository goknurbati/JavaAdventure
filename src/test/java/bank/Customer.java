package bank;

import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int customerID;
    private Date accountOpeningDate;
    private String account;

    public Customer(int customerID, Date accountOpeningDate, String account){
        this.customerID = customerID;
        this.accountOpeningDate = accountOpeningDate;
        this.account=account;
    }
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public Date getAccountOpeningDate() {
        return accountOpeningDate;
    }
    public void setAccountOpeningDate(Date accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
}



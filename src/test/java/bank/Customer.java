package bank;

public class Customer {
    private int customerID;
    private String accountOpeningDate;
    private long account;

    public Customer(int customerID, String accountOpeningDate, long account) {
        this.customerID=customerID;
        this.accountOpeningDate=accountOpeningDate;
        this.account=account;
    }
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }
    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }
    public long getAccount() {
        return account;
    }
    public void setAccount(long account) {
        this.account = account;
    }
}



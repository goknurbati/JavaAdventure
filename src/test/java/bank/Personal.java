package bank;

public class Personal extends Customer{

    private String customerFullName;

    public Personal(int customerID, String accountOpeningDate, long account) {
        super(customerID, accountOpeningDate, account);
    }

    public String getCustomerFullName() {

        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }
}

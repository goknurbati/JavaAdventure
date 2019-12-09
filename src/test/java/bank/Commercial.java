package bank;

public class Commercial extends Customer{

    private String companyName;
    private String creditType;

    public Commercial(int customerID, String accountOpeningDate, long account) {
        super(customerID, accountOpeningDate, account);
    }


    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }
}

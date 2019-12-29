package bank;

import java.util.Date;

public class Commercial extends Customer{

    private String companyName;
    private String creditType;

    public Commercial(){
        super(customerID, accountOpeningDate,account);
        this.companyName = companyName;
        this.creditType = creditType;
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

package xyzCompany;

public class Manager extends Employee {
    private String branch;
    public static final double BONUSPERCENT=0.2;

    public Manager(String name, String surname, int id) {
        super(name, surname, id);
    }

    public String getBranch() {
        return branch;
    }

    public double getSalary(double salary) {
        return salary+salary*BONUSPERCENT;
    }

}


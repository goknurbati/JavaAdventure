package HR;

public class GeneralManager extends Employment {
    private String branch;

    public GeneralManager(String name, String surname) {
        super(name, surname);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}

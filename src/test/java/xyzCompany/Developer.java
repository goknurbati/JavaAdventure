package xyzCompany;

public class Developer extends Employee {

    private String project;
    private String title;
    private String team;
    public static final double BONUSPERCENT=0.1;

    public Developer(String name, String surname, int id) {
        super(name, surname, id);
    }

    public String getProject() {
        return project;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeam() {
        return team;
    }

    public double getSalary(double salary) {
        return salary+salary*BONUSPERCENT;
    }



}

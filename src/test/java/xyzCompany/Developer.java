package xyzCompany;

public class Developer extends Employee {
    private String project;
    private String title;
    private String team;
    private int score;


    public Developer(String name, String surname, int id,double salary) {
        super(name, surname, id,salary);
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

    @Override
    public String getDepartment() {
        if(team =="RoadRunner" && project == "BIP"){
            return "Telecommunication";
        }
        else
        return "ID : " + getId() +"team" + team + "project : " + project;
    }
    @Override
    public String getTraining(){
        if(title == "backend developer"){
            System.out.println("Introduction to OOP");
        }
        else if(title == "frontend developer"){
            System.out.println("Learn to CSS");
        }
        else if (title == "fullstack developer"){
            System.out.println("Database");
        }
        else
            System.out.println((title != "Backend Developer") || (title != "Frontend Developer") || (title != "Fullstack Developer"));
           return "Name : "+getName() + "Surname :"+getSurname();
    }

}

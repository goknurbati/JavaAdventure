package xyzCompany;

public class Developer extends Employee {

    private String project;
    private String title;
    private String team;

    //salary Emplayee'de tanımladım ve extend ettim,
    // fakat salary'i ayrıca Developer ve Manager classlarında da tanımlamam gerekti, tanımlamadığımda hata verdi
    private double salary;
    private int score;

    public static final double BONUSPERCENT=0.2;

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
    public double getSalary() {
        return salary+salary*BONUSPERCENT;
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
    @Override
    public String getPerformance(){
        if(score >= 70){
            System.out.println("effective");
        }
        else if (score == 50) {
            System.out.println("least effective");
        }
        return title + team +project;
    }
}

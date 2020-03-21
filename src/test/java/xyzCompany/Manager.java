package xyzCompany;

public class Manager extends Employee {
    private String branch;
    private double salary;
    private int score;

    public static final double BONUSPERCENT=0.3;

    public Manager(String name, String surname, int id,double salary) {
        super(name, surname, id, salary);
    }
    public String getBranch() {
        return branch;
    }
    @Override
    public double getSalary() {
        return salary+salary*BONUSPERCENT;
    }
    @Override
    public  String getTraining(){
        if(branch == "Europe"){
            System.out.println("International Relations");
        }
        else if(branch == "Turkey") {
            System.out.println("Managemet Skills");
        }
        else System.out.println("Branch : " + branch);
            return branch;
    }
    @Override
    public String getDepartment() {
        if(branch =="Europe"){
            return "Sales and Marketing";
        }
        else if(branch == "Turkey"){
            return "IT";
        }
        else return "name :" +getName() + "surname :" + getSurname();
    }
    @Override
    public String getPerformance(){
        if(score >= 70 && branch == "Europe" || branch == "TR"){
            return "Effective";
        }
        else if(score == 50 && branch == "Europe" || branch == "TR"){
            return "Least Effect";
        }
        else return "name :" +getName() + "surname :" + getSurname();
    }
}


package xyzCompany;

public class Employee {
    private String name;
    private String surname;
    private int id;
    private String department;
    private double salary=3000;

    public Employee (String name,String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "asdasd" + surname + "qweqwe" + id + 123123;
    }


}




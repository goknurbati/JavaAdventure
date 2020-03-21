package xyzCompany;

import Library.Book;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String surname;
    private int id;
    private String department;
    private String training;
    private String performance;
    private int score;
    private double salary=3000;

    public Employee(String name, String surname, int id, double salary){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.salary= salary;
    }

    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public String addEmployee(Employee employee){
        employees.add(employee);
        return employee.getName();
    }

    public int updateEmployee(Employee employee) throws IllegalArgumentException {
        if(employee!=null) {
            Employee oldEmployee = getByEmployeeId(employee.getId());
            oldEmployee.setName(employee.getName());
            return employee.getId();
        }
        throw new IllegalArgumentException(id + "employee id doesn't exist");
    }
        public Employee getByEmployeeId(int id){
            for(int i=0;i<employees.size();i++){
                if(employees.get(i).getId()==id){
                    return employees.get(i);
                }
            }
            throw new IllegalArgumentException(id + "employee id doesn't exist");
        }
    public int deleteEmployee(Employee employee){
        if(employee!=null) {
            Employee deletedEmployee = getByEmployeeId(employee.getId());
            deletedEmployee.setName(employee.getName());
            return employee.getId();
        }
        employees.remove(employee);
        return employee.getId();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
    public String getTraining() {
        return training;
    }
    public String getPerformance() {
        return performance;
    }
    @Override
    public String toString() {
        return name + "asdasd" + surname + "qweqwe" + id + 123123;
    }
}




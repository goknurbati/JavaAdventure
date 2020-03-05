package xyzCompany;

public class Main {
    public static void main (String args []){
        Employee emp = new Employee("asd","asd",12);

        Developer developer = new Developer("goknur","bati",123);

        developer.setTitle("junior developer");
        showDetails(developer);
        performanceAssessment(developer);
        trainingProcess(developer);
        getSalary(developer);
    }

    public static void showDetails(Employee emp){
        if(emp instanceof Developer) {
            Developer dev = (Developer)emp;
            System.out.println(dev.getTitle());
        }
        else if(emp instanceof Manager){
            Manager manager = (Manager)emp;
            System.out.println(manager.getBranch());
        }
        else System.out.println(emp.getName()+emp.getSurname());
    }

    public static void performanceAssessment(Employee emp) {
        if(emp instanceof Developer){
            Developer dev= (Developer)emp;
            System.out.println(dev.getTitle()+dev.getProject());
        }
        else if(emp instanceof Manager){
            Manager manager = (Manager)emp;
            System.out.println(manager.getBranch()+manager.getDepartment());
        }
        else System.out.println(emp.getName()+emp.getSurname()+emp.getDepartment());
    }
    public static void trainingProcess(Employee emp){
        if(emp instanceof Developer){
            Developer dev = (Developer)emp;
            System.out.println(dev.getDepartment());
        }
        else if(emp instanceof Manager){
            Manager manager = (Manager)emp;
            System.out.println(manager.getBranch());
        }
        else System.out.println(emp.getName()+emp.getSurname()+emp.getDepartment());
    }

    public static void getSalary(Employee emp){
        if(emp instanceof Developer){
            Developer developer= (Developer)emp;
            System.out.println(developer.getSalary());
        }
        else if(emp instanceof Manager){
            Manager manager = (Manager)emp;
            System.out.println(manager.getSalary());
        }
        else System.out.println(emp.getSalary());
    }



}


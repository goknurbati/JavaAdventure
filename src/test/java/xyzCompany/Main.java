package xyzCompany;

public class Main {

    public static void main (String args []){

        //Employee emp = new Employee("asd","asd",12, 10000);

        //Developer developer = new Developer("goknur","bati",123,15000);

        //Manager manager = new Manager ("meryem","alay",01,25000);

       /* developer.setTitle("junior developer");
        showDetails(developer);*/

        Employee [] emps = {new Employee("asd","asd",10, 10000), new Developer("fıtıfıtı","bıdıbıdı",11,15000),new Manager("qweqwe","qweqwe",12,25000)};
        for(Employee empy:emps){
            //empy.addEmployee(empy);
            //empy.getSalary();
            //empy.calculateNetSalary(0.2);
            empy.getPerformance(85);
            System.out.println(emps);

            /*empy.getDepartment();
            System.out.println(empy);
            empy.getTraining();
            empy.getPerformance();*/
        }
    }
    /*public static void Salary(Employee emp){
        if(emp instanceof Developer){
            Developer developer= (Developer)emp;
            System.out.println(developer.getSalary());
        }
        else if(emp instanceof Manager){
            Manager manager = (Manager)emp;
            System.out.println(manager.getSalary());
        }
        else System.out.println(emp.getSalary());
    }*/
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
  /*  public static void performanceAssessment(Employee emp) {
        if(emp instanceof Developer){
            Developer dev= (Developer)emp;
            System.out.println(dev.getTitle()+dev.getProject());
        }
        else if(emp instanceof Manager){
            Manager manager = (Manager)emp;
            System.out.println(manager.getBranch()+manager.getDepartment());
        }
        else System.out.println(emp.getName()+emp.getSurname()+emp.getDepartment());
    }*/
    /*public static void trainingProcess(Employee emp){
        if(emp instanceof Developer){
            Developer dev = (Developer)emp;
            System.out.println(dev.getDepartment());
        }
        else if(emp instanceof Manager){
            Manager manager = (Manager)emp;
            System.out.println(manager.getBranch());
        }
        else System.out.println(emp.getName()+emp.getSurname()+emp.getDepartment());
    }*/

}


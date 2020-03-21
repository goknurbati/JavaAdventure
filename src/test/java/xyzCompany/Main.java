package xyzCompany;

public class Main {

    public static void main (String args []){

        //Employee emp = new Employee("asd","asd",12, 10000);

        //Developer developer = new Developer("goknur","bati",123,15000);

        //Manager manager = new Manager ("meryem","alay",01,25000);

       /* developer.setTitle("junior developer");
        showDetails(developer);*/

        //Polimorphism uygularsak downcasting yapıp instanceof yapmamıza gerek kalmıyor, öyle yaparsak kod procedural oluyor değil mi?
        Employee [] emps = {new Employee("asd","asd",12, 10000), new Developer("fıtıfıtı","bıdıbıdı",10,15000),new Manager("qweqwe","qweqwe",07,25000)};
        for(Employee empy:emps){

            //Metodları bi türlü gösteremiyorum. Çalıştırdığımda true - Branch: null dönüyor sadece.
            //Developer-Manager classları içerisinede developer ve employee newlediğim zaman stack over flow hatası alıyorum.
            empy.getSalary();

            empy.addEmployee(empy);
            
            empy.getDepartment(); //id - team - project
            empy.getTraining(); //title - branch
            empy.getPerformance(); // title - team - project -- name - surname

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


package HR;

public class Main {
   public static void main (String [] args){
       //Employment e= new Employment("goknur","bati");
      // Developer dev=(Developer)e; //downcasting

       Developer d = new Developer("goknur","bati");
       d.setTitle("Junior Developer");
       showDetail(d);

       //GeneralManager gm =new GeneralManager("goknur","bati");
       //gm.setBranch("Toronto");
       //showDetail(gm);

       //Employment emp = (Employment)d;
   }
   public static void showDetail(Employment emp){
       if(emp instanceof Developer){
           Developer dev= (Developer)emp;
           System.out.println(dev.getTitle());
       }else if(emp instanceof GeneralManager){
           GeneralManager gm = (GeneralManager)emp;
           System.out.println(gm.getBranch());
       }else
           System.out.println(emp.getName());
   }
}

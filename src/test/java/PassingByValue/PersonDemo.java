package PassingByValue;

public class PersonDemo {
    public static void main(String [] args){
        //initialize
        Person person1=new Person("Goknur",34);

        //didn't initialize
        Person person2;

        person2=person1;

        person2.changeDetails("Meryem",30);

        System.out.println(person1);


    }
}


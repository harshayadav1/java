package inheritance;

public class Person {

    protected String name;


    public Person(String name){
        this.name=name;
        System.out.println("inside person class constructor");

    }

    public void eat(){
        System.out.println("person " +name +" is eating");
    }
    
    public void walk(){
        System.out.println("person " +name+" is walking");
    }
}

package inheritance;

public class Teacher extends Person {

    public Teacher(String name){
        super(name);
        System.out.println("inside teacher class constructor");

    }

    public void teach(){
        System.out.println("teacher "+name +" is teaching ");
    }

    public void eat(){
        super.eat();
        System.out.println("teacher " +name +" is eating");
    }
    
}

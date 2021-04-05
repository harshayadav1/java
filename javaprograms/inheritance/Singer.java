package inheritance;

public class Singer extends Person {

    public Singer(String name){
        super(name);
        System.out.println("in singer class constructor");
    }

    public void sing(){
        System.out.println("singer "+name +" is singing");
    }
    
}

package singletons;

public class Mainclass {

    public static void main(String[] args) {
        
        Appconfig obj=Appconfig.getInstance();
        Appconfig obj1=Appconfig.getInstance();
        Appconfig obj2=Appconfig.getInstance();
    }

    
}

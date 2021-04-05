package encapsulation;
public class Static {

    static{
        System.out.println("in block1");
    }

    static{
        System.out.println("in block2");
    }

    public static void main(String[] args) {

        System.out.println("in main");


        //Ab obj1= new Ab();
       // Ab.b obj2= obj1.Ab.b();
        
       // Ab.c obj= new Ab.c();
    }
    static{
        System.out.println("in block3");
    }
}

package tcsnqt;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the member ");
        String par=sc.next();
        System.out.println("enter Y if he is parent else enter N");
        String x=sc.next();
        int length=0;
        if(x == "n"){
            System.out.println("total members is:1");
            System.out.println("commision details");
            System.out.println(par +" :250 INR");
        }
        else{
            String children=sc.next();
            
        //String name="i love java, the cofee";

        String[] name1= children.split(",");

        for( int i=name1.length-1;i>=0;i--){
            String a=name1[i];
            System.out.print(a+" ");
            
            
        }
        
            
    
            
        }
    }
    
}


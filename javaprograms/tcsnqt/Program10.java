package tcsnqt;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        String c[]={"Espresso Coffee","Cappuccino Coffee","Latte Coffee"};
        String t[]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
        String s[]={"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
        String b[]={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};

        

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        String ch=sc.next();
        System.out.println("enter item");
        int item=sc.nextInt();
        int i;

        if(ch.equals("c")){
            if(item>=4){
                System.out.println("INVALID INPUT");
            }

            else{

            System.out.println("welcome to cod");
            System.out.println("enjoy your "+c[item-1]);
            }
            
            
            

        }
        else if(ch.equals("t")){
            if(item>=9){
                System.out.println("INVALID INPUT");
            }

            else{

            System.out.println("welcome to cod");
            System.out.println("enjoy your "+t[item-1]);
            }
        }
        else if(ch.equals("s")){
            if(item>=4){
                System.out.println("INVALID INPUT");
            }

            else{
            System.out.println("welcome to cod");
            System.out.println("enjoy your "+s[item-1]);
            }
        }
        else if(ch.equals("b")){
            if(item>=3){
                System.out.println("INVALID INPUT");
            }

            else{

            System.out.println("welcome to cod");
            System.out.println("enjoy your "+b[item-1]);
            }
        }
        else{
            System.out.println("INVALID INPUT");
        }

    }
    
}

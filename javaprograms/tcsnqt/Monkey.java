package tcsnqt;

import java.util.Scanner;

public class Monkey {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total no. of monekys");
        int n=sc.nextInt();
        System.out.println("enter no.of bananas single monkey can eat");
        int k=sc.nextInt();
        System.out.println("enter no.of peanets a single monkey can eat");
        int j=sc.nextInt();
        System.out.println("enter the total number of bananas offered");
        int m=sc.nextInt();
        System.out.println("enter total number of peanets offered");
        int p=sc.nextInt();
        int atebananas=0,atepeanats=0;
        if(n<0 && k<0|| j<=0 || m<0 || p<0){
            System.out.println("INVALID INPUT");
        }
        else {
            if(k>0){
                atebananas=m/k;

            }
            if(j>0){
                atepeanats=p/j;
            }
            n=n-atebananas-atepeanats;
            System.out.println("the no. of monkeys left on tree is: "+n);
        }
    }
    
}

package recursion;

import java.util.Scanner;

public class gameofstones {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(n>=7){
                n=n%7;
            }
            if(n==0||n==1){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
    
}
}

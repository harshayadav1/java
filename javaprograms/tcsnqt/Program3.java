package tcsnqt;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    int n=10, k=5;
    System.out.println("enter n");
    int num=sc.nextInt();
    if(num>1 && num<=k){
        System.out.println("no. of candies sold: "+num);
        System.out.println("no. of candies left: "+(n-num));
    }
    else {
        System.out.println("INVALID INPUT");
        System.out.println("no. of candies left:"+n);
    }
}
    
}

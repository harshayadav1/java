package tcsnqt;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter nth number");
        int n=sc.nextInt();
		System.out.println(n%2==0?(int)Math.pow(3,(n-1)/2):(int)Math.pow(2,(n-1)/2));
       
    }
    
}

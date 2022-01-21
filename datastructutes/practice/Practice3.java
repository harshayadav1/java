package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger a[]=new BigInteger[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextBigInteger();
        }
        for( BigInteger e: a){
            System.out.println(e);
        }
    }
    
}

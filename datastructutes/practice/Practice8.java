package practice;

import java.math.BigInteger;
import java.util.Scanner;

public class Practice8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        BigInteger sum= BigInteger.ONE;
        for(long i=n;i>0;i--){
            sum=sum.multiply(BigInteger.valueOf(i));   
        }
        System.out.println(sum);
    }
}
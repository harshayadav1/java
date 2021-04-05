package hackerrank;

import java.util.Scanner;

public class Prob2{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        int count=0;
        
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
             
         }
         for(int i=0;i<n-1;i++){
             if(a[i]==a[i+1]){
                 count++;
                 
             }
         }
        
        System.out.println(count);
    }
}
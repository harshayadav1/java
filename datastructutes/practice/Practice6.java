package practice;

import java.util.Scanner;

public class Practice6 {
        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x=sc.nextInt();
            
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            
            
            for(int i=0;i<x;i++){
                int m=sc.nextInt();
                System.out.println(a[(n-(k%n)+m)%n]);
            }
            
            
            
        }
    }
    


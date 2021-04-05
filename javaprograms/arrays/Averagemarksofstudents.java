package arrays;

import java.util.Scanner;

public class Averagemarksofstudents {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the number of students");            
         int n=sc.nextInt();
         int marks[]=new int[n];

         System.out.println("enter the marks of students");

         for(int i=0;i<n;i++){
             marks[i]=sc.nextInt();

         }

         int averagemarks=0;
         for(int i=0;i<n;i++){
             averagemarks+= marks[i];

         }

         averagemarks/=n;
         System.out.println("average marks of students is " +averagemarks);
            
        
    }
    
}

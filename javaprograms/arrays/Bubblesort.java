package arrays;

import java.util.Scanner;


public class Bubblesort {

    public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);
        
    int a[]={-3,10,1,6,-4};
    int n=a.length;
    boolean sorted=true;


        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j+1]<a[j]){

                int temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
                sorted=false;
           }
       }
       if(sorted) break; //to get more optimised code we use boolean
    }

       for(int items: a){
           System.out.print(items +" ");
       }
   
    }
    
}

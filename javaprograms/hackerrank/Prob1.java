package hackerrank;

import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int sum4=0;
        int sum5=0;
        for(int i=0;i<n;i++){
            if(i!=0){
            
            
           sum1= sum1+ arr[i];
            }
            
        }
        for(int i=0;i<n;i++){
            if(i!=1){
                sum2=sum2+arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i!=2){
                sum3=sum3+arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i!=3){
                sum4=sum4+arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(i!=4){
                sum5=sum5+arr[i];
            }
        }
        int sum6=Math.max(sum1,sum2);
        int sum7=Math.max(sum6,sum3);
        int sum8=Math.max(sum7,sum4);
        int sum9=Math.max(sum8,sum5);
        
        int min1=Math.min(sum1,sum2);
        int min2=Math.min(min1,sum3);
        int min3=Math.min(min2,sum4);
        int min4=Math.min(min3,sum5);
        System.out.println(min4 +" " +sum9);
        
        
    }
    
}

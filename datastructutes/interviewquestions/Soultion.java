package interviewquestions;

import java.util.Scanner;

public class Soultion {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a[]= new int[26];
        for(int i=0;i<26;i++){
            a[i]=sc.nextInt();
        }
        String s=sc.next();
        int x=s.length();
        int sum=0;
        int count=1;
        for(int i=0;i<x;i++){
            int num=s.charAt(i);
            num=num-97;
            if(a[num]==sum && i>1){
                count=0;
                count++;
            }
            sum=Math.max(sum,a[num]);
            
        }
        int ans=sum*count*x;
        System.out.println(ans);
        
        
       
   
   }
    
}

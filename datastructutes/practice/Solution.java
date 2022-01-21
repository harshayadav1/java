package practice;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        s=s.replaceAll("\\s","");
        int l=s.length();
        int r=(int)Math.sqrt(l);
        int c=r;
        if(c*r<l){
            c=c+1;
        }
        for(int i=0;i<c;i++){
            for(int j=i;j<l;j=j+c){
                char ch=s.charAt(j);
                System.out.print(ch);
            }
            System.out.print(" ");
        }
       
       
        
    }

}
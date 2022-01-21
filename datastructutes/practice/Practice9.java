package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="qwertyuiopasdfghjklzxcvbnm";
        String s1=sc.next();
        int n1=s.length();
        int n2=s1.length();
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(int i=0;i<n1;i++){
            char c=s.charAt(i);
            char d=s1.charAt(i);
            a[i]=c;
            b[i]=d;

        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
               if(b[i]==a[j]){
                   a[j]='\0';
                   break;
               }
            }
            
        }
        if(a.length==0){
            System.out.println("panagarm");
        }
        else{
            System.out.println("not panagram");
        }
    }
    
}

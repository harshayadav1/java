package interviewquestions;

import java.util.Scanner;

public class Ceaserciper{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int k=sc.nextInt();
        String str="";
        int left;
        for(int i=0;i<n;i++){
           int  c=s.charAt(i);
            int d=c;
            if(d>=65 && d<=90){
                if(d+k<=90){
                    d=d+k;
                    char x=(char)d;
                    str=str+x;
                }
                else {
                    left=(d+k)-90;
                    d=64+left;
                    char x=(char)d;
                    str=str+x;

                }

            }
            else if(d>=97 && d<=122){
                if(d+k<=122){
                    d=d+k;
                    char x=(char)d;
                    str=str+x;
                }
                else{
                    left=(d+k)-122;
                    d=96+left;
                    char x=(char)d;
                    str=str+x;

                }
            }
            else if(d>=48 && d<=57){
                if(d+k<=57){
                    d=d+k;
                    char x=(char)d;
                    str=str+x;
                }
                else {
                    left=(d+k)-57;
                    d=47+left;
                    char x=(char)d;
                    str=str+x;

                }

            }
            
            else{
                char x=(char)d;
                str=str+x;
            }
        }
        
        System.out.println(str);
        
    }
}
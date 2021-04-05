package tcsnqt;

import java.util.Scanner;



public class Problem2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int n=s.length();
        char c;
        String str="";

        for(int i=0; i<n;i++){
            c=s.charAt(i);
            switch(c){
                case 'a': c='z';
                str=str+c;
                break;
                case 'b': c='y';
                str=str+c;
                break;
                case 'c': c='x';
                str=str+c;
                break;
                case 'd': c='w';
                str=str+c;
                break;
                case 'e': c='v';
                str=str+c;
                break;
                case 'f': c='u';
                str=str+c;
                break;
                case 'g': c='t';
                str=str+c;
                break;
                case 'h': c='s';
                str=str+c;
                break;
                case 'i': c='r';
                str=str+c;
                break;
                case 'j': c='q';
                str=str+c;
                break;
                case 'k': c='p';
                str=str+c;
                break;
                case 'l': c='o';
                str=str+c;
                break;
                case 'm': c='n';
                str=str+c;
                break;
                case 'n': c='m';
                str=str+c;
                break;
                case 'o': c='l';
                str=str+c;
                break;
                case 'p': c='k';
                str=str+c;
                break;
                case 'q': c='j';
                str=str+c;
                break;
                case 'r': c='i';
                str=str+c;
                break;
                case 's': c='h';
                str=str+c;
                break;
                case 't': c='g';
                str=str+c;
                break;
                case 'u': c='f';
                str=str+c;
                break;
                case 'v': c='e';
                str=str+c;
                break;
                case 'w': c='d';
                str=str+c;
                break;
                case 'x': c='c';
                str=str+c;
                break;
                case 'y': c='b';
                str=str+c;
                break;
                case 'z': c='a';
                str=str+c;
                break;
                default: System.out.println("INVALID INPUT");
            }
        }
        System.out.println(str);
    }
    
}

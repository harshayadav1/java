package tcsnqt;
import java.util.Scanner;

public class Cryptocode {

    
   public static void main(String[]args) {
       Scanner sc= new Scanner(System.in);
       String s= sc.next();
       int n=s.length();
       char c;
       int k;
       String str="";
       

       for(int i=0; i<n;i++){
           c=s.charAt(i);
            int d = c;
            if(d<=90){
            k=155-d;
           char z= (char) k;
           str = str+z;
            }
            else{
            k=219-d;
           char z= (char) k;
           str = str+z;
            }
       }
       sc.close();
       System.out.println(str);

       
   }
}
    


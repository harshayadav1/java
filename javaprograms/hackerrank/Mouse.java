package hackerrank;
import java.util.Scanner;

public class Mouse {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c1[]=new int[n];
        int c2[]=new int[n];
        int m[]=new int[n];
        for(int i=0;i<n;i++){
             c1[i]=sc.nextInt();
             c2[i]=sc.nextInt();
             m[i]=sc.nextInt();
            
            }
            for(int i=0;i<n;i++){
                if(Math.abs(m[i]-c2[i])<Math.abs(m[i]-c1[i])){
                
                    System.out.println("Cat B");
                        
                        
                    }
                    else if(Math.abs(m[i]-c1[i])==Math.abs(m[i]-c2[i])){
                        
                    System.out.println("Mouse C ");
                        
                    }
                    else{
                        System.out.println("Cat A");
                    }
            }
        }
    
}

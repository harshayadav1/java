package tcsnqt;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        int ni,ne;
        float intp=18,extp=12,cost=0,temp;
        Scanner sc= new Scanner(System.in);
        ni=sc.nextInt();
        ne=sc.nextInt();
        if(ni<0 || ne<0){
            System.out.println("INVALID INPUT");
        }
        else if(ni==0 || ne==0){
            System.out.println("estimated cost is : 0");
        }
        else{
            for(int i=0;i<ni;i++){
                temp=sc.nextFloat();
                cost+=intp*temp;
            }
            for(int i=0;i<ne;i++){
                temp=sc.nextFloat();
                cost+=extp*temp;
            }
            System.out.println("total estimated cost : "+cost);
        }
    }

    
}

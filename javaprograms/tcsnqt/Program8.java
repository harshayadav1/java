package tcsnqt;

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        String s,d;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter source point");
        s=sc.next();
        System.out.println("enter destination");
        d=sc.next();
        String arrs[]={"TH","GA","IC","HA","TE","LU","NI","Ca"};
        float arr[]={800,600,750,900,1400,1200,1100,1500};
        float res=0;
        int st,ed;
        for(int i=0;i<8;i++){
            if(s==arrs[i]){
                st=i;
            }
            if(d==arrs[i]){
                ed=i;
            }
        }
        if(st==ed){
            System.out.println("INVALID INPUT");
        }
        else{
            int i=st+1;
            System.out.println(i);
            while(i!=ed+1){
                res+=(arr[i]);
                i=(i+1)%8;
            }
            System.out.println(res*0.005);
        }

    }
    
}

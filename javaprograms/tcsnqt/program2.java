package tcsnqt;

import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {
        int n,a=0,b=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the n value");
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
    {
        if(i%2!=0)
        {
            if(i>1)
                a = a + 2;
        }
        else
        {
            b = a/2;
        }
    }

    if(n%2!=0)
    {
        System.out.println(a);
    }
    else
    { 
        System.out.println(b);
    }
    }

    
}

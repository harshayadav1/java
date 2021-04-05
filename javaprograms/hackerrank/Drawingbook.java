package hackerrank;

import java.util.Scanner;

public class Drawingbook {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int ans=Math.min(p/2,(n-p)/2);
        System.out.println(ans);
    }



    
}

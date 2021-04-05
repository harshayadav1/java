package tcsnqt;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        double area;
        if(r>=20 && r<=30){

            area=3.14*r*r;
            System.out.println("%.2f",area);

        }
        else{
            System.out.println("INVALID OUTPUT");
        }
    }
    
}

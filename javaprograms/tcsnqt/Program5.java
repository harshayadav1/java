package tcsnqt;

import java.util.Scanner;

public class Program5 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int weight=sc.nextInt();

        if(weight==0){
            System.out.println("Time Estimated : 0");
        }
        else if(weight>0&& weight<=2000){
            System.out.println("Time Estimated : 25 mins");
        }
        else if(weight>2000 && weight<=4000){
            System.out.println("Time Estimated : 35 mins");
        }
        else if(weight>4000 && weight<=7000){
            System.out.println("Time Estimated : 45 mins");
        }
        else{
            System.out.println("INVALID INPUT");
        }

    }

    
}

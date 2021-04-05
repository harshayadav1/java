import java.util.Scanner;

public class Whilelopp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int temp=n;
        // int sum=0;
        // while(temp>0){
        //     int lastdigit= temp%10;
        //     temp=temp/10;
        //     sum+=lastdigit;

        // }
        // System.out.println("the sum of digits of "+n + " is " +sum);
        int numberofdigits= (int)Math.log10(n)+1;
        System.out.println(numberofdigits);
    }

}
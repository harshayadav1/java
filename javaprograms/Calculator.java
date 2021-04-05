import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();

        System.out.println("enter 2nd number");
        int b=sc.nextInt();

        System.out.println("enter the operation to be performed");
        sc.nextLine();
        char operation=sc.nextLine().charAt(0);
        int Result=0;

        switch(operation) {
            case '+':
                Result=a+b;
                break;
            case '-':
                Result=a-b;
                break;
            case '*' :
                Result=a*b;
                break;
            case '%':
                Result=a%b;
                break;
            case '/':
                Result=a/b;
                break;
            default:
                System.out.println("invalid operation");

        }
        System.out.println("result is " +Result);


    }
    
}

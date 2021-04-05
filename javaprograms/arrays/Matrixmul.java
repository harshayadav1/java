package arrays;

import java.util.Scanner;

public class Matrixmul {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter rows and columns");

        int rows=sc.nextInt();
        int cols=sc.nextInt();

        int a[][]=new int[rows][cols];
        int b[][]=new int[rows][cols];

        System.out.println("enter 1t matrix");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter 2nd matrix");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                b[i][j]=sc.nextInt();
            }
        }

        int c[][]= new int[rows][cols];
        

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                
                for(int k=0;k<cols;k++){
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("result is");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}

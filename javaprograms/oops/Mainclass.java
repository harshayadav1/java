package oops;

public class Mainclass{
    public static void main(String[] args) {

        int firstnumber=34;
        int secondnumber=20;

        int result=maxof(firstnumber,secondnumber);
        System.out.println(result);
        
    }

   static int maxof(int a, int b){
        if(a>b){
            return a;
        }
        else{ 
            return b;

        }
    }

}

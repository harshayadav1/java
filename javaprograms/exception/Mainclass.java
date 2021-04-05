package exception;
public class Mainclass {
    public static void main(String[] args) {

        fun1();
       
    }
    static void fun1(){
        int a=5;
        int b=2;
        int c=a/b;
        System.out.println(c);
        boolean isdanger=true;
        if(isdanger){
            throw new ArrayIndexOutOfBoundsException("danger is coming");
        }
    }
    
}

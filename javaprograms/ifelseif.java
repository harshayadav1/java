import javax.naming.spi.DirStateFactory.Result;

public class ifelseif {
    public static void main(String[] args) {
        //nested if code
        int a=12, b=18, c=8,Result;

        // if(a>b){
        //     if(a>c){
        //         Result=a;
                
        //     }
        //     else{
        //         Result=c;
        //     }
        // }
        // else{
        //     if(b>c){
        //         Result=b;
        //     }
        //     else{
        //         Result=c;
        //     }
        // }
        Result= a>b?a>c?a:c:b>c?b:c;
        System.out.println("the largest number is "+Result);
    }
    
}

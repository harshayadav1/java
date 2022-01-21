package practice;

import java.util.Scanner;
import java.util.Stack;

public class Practice {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
       
        while(n--!=0){
            String s=sc.nextLine();
            
            Stack<Character> stack= new Stack<>();
            boolean isBalanced=true;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='('|| c=='{'|| c=='['){
                    stack.push(c);
                    continue;
                    
                }
                if(c==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else{
                        isBalanced=false;
                        break;
                    }
                }
                if(c=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }
                    else{
                        isBalanced=false;
                        break;
                        
                    }
                }
                if(c==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                    else{
                        isBalanced=false;
                        break;
                    }
                }
            }
            if(!stack.isEmpty()){
                isBalanced=false;
            }
            if(isBalanced){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
            
        }
    }
}

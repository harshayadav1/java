package Stacks;

import java.util.Stack;

public class Mainclass{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(20);
        stack.pop();
        int popped=stack.peek();
        System.out.println(popped);
        
    }
}
package Deque;



public class Mainclass {
    public static void main(String[] args) {
        Mydeque<Integer> f= new Mydeque();
        f.addToHead(12);
        f.addToHead(13);
        
        System.out.println(f.removeLast());
    }
    
}

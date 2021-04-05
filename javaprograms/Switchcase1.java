public class Switchcase1 {
    public static void main(String[] args) {
        int rating=5;
        switch(rating){
            case 1:
            case 2: 
                System.out.println("bad");
                break;
            case 3: 
                System.out.println("avg");
                break;
            case 4:
            case 5:
                System.out.println("good");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
    
}

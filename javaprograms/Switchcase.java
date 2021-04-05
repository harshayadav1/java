public class Switchcase {
    public static void main(String[] args) {
        int day=4;
        switch(day) {
            case 1:
                System.out.println("im on leave");
                break;
            case 2:
                 System.out.println("im in office");
                 break;  
            case 3:
            case 4:
                 System.out.println("im currently unavailable");
                 break;
           
            case 5:
                System.out.println("im on sky");
                break;
            default :
                System.out.println("invalids");
                break;
        }
    }
    
}

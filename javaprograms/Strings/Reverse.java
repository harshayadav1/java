package Strings;

public class Reverse {

    public static void main(String[] args) {

        
     //String cars="Hyundai,Bmw,Mercides,Tesla,Cubertruck";

     // String[] allcars= cars.split(",");
 
     //  for(String a:allcars){
     //      System.out.println(a);
     //  }

//      for (type var : array) 
// { 
//     statements using var;
// }
// is equivalent to:

// for (int i=0; i<arr.length; i++) 
// { 
//     type var = arr[i];
//     statements using var;
// }
        
        String name="i love java, the cofee";

        String[] name1= name.split(" ");

        for( int i=name1.length-1;i>=0;i--){
            String a=name1[i];
            System.out.print(a+" ");
            
            
        }
        

        // for(String a:name1){

        //         System.out.println(a);

        //         System.out.println();
            


        // }

        
    }
    
}

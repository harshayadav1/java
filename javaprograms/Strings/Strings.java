package Strings;

public class Strings {

    public static void main(String[] args) {

        //strings are immuntable. strings by literl are stroed in string pool area and string by object are stores in heap 
        // area and also in string pool area.
        
         //String a="harsha";
        // String b="harsha";
        // String c= new String("harsha");

        // System.out.println(a==c);

        // string functions: 
        //1. char charAt(int index)

        // String name="harsha";
        // System.out.println(name.charAt(0));

        //2. int length:

        // String name="harsha";
        // System.out.println(name.length());

        //3. string substring(beignindex)
        //System.out.println(name.substring(3));

        // 4. string substring(int beginindex,end index)

       // System.out.println(name.substring(2,5));

      // boolean contains(charsequence s)

      //  System.out.println(name.contains("rahul"));
        // 5. object equals
     // String name="harsha";
     // String name2= new String("harsha");
      //String name3="";
     // System.out.println(name.equals(name2));

      //isempty

      //System.out.println(name3.isEmpty());
        //concat

      //  System.out.println(name.concat(" yadav"));

      //replace
     // System.out.println(name.replace('a', 'z'));

     //split

     String cars="Hyundai,Bmw,Mercides,Tesla,Cubertruck";

    // String[] allcars= cars.split(",");

    //  for(String a:allcars){
    //      System.out.println(a);
    //  }

    // indexof

   // System.out.println(cars.indexOf("a"));

   // to lower case
  // System.out.println(cars.toLowerCase());
  //System.out.println(cars.toUpperCase());
  //trim 
        String name4="   harsha    ";
        System.out.println(name4.trim());



        
    }
    
}

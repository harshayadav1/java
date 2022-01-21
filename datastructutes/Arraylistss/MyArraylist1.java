package Arraylistss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArraylist1 {
    public static void main(String[] args) {
        List<String> fruits= new LinkedList();
       

        fruits.add("harsha");
        fruits.add("orange");
        fruits.add("hi");
       // fruits.set(0,"apple");
       // fruits.remove(2);
    //    List<String> toremove= new ArrayList<>();
    //    toremove.add("harsha");
    //    toremove.add("hi");
    //    fruits.removeAll(toremove);
      // fruits.clear();
       
        // System.out.println(fruits.size());
      //  System.out.println(fruits.contains("harsha"));
         // System.out.println(fruits.isEmpty());
         String temp[]=new String[fruits.size()];
         fruits.toArray(temp);
         for(String e:temp){
             System.out.println(e);
         }
       
    }
    
}

package Arraylistss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<>();
        List<Integer> aa=new ArrayList<>();
        getdifference(aa);
        getdifference(ll);

       
    }
    static void getdifference(List<Integer> list){

        long start=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            list.add(0,i);
        }
        long end=System.currentTimeMillis();
        System.out.println(list.getClass().getName()+"-->"+(end-start));

    }
    
}

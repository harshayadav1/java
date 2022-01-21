package interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class Subarray1 {
    public static void main(String[] args) {
        int a[]={2,1,3,-4,-2};
        int k=10;
        boolean found=false;
        Set<Integer> set=new HashSet<>();
        int sum=0;
        for(int element: a){
            set.add(sum);
            sum=sum+element;
            if(set.contains(sum-k)){
                found=true;
                break;

            }
        }
        System.out.println("found "+ found);
    }
    
}

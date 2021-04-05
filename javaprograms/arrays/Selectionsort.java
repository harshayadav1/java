package arrays;

public class Selectionsort {

    public static void main(String[] args) {
        int a[]={10,2,-3,-30,60,25};
        int n=a.length;

        for(int i=0;i<n-1;i++){
            int midindex=i;
            for(int j=i;j<n;j++){

                if(a[j]<a[midindex]){
                    midindex=j;
                }

            }
            int temp=a[i];
            a[i]=a[midindex];
            a[midindex]=temp;
        }

        for(int e: a){
            System.out.print(e+" ");
        }
    }
    
}

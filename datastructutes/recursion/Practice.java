package recursion;

public class Practice {
    public static void main(String[] args) {
        int a[][]={{1,1,1,1,1,1,1,1},
                   {1,1,1,1,1,1,0,0},
                   {2,2,2,2,2,2,2,2},
                   {2,2,2,2,1,1,1,1},
                   {1,1,1,1,1,1,1,1},
                   {1,1,1,1,1,1,0,0},
                   {2,2,2,2,2,2,2,2},
                   {2,2,2,2,1,1,1,1},

        };   
        Floodcolor(a, 4, 4, 5, 1);
        Printmat(a);

}
            static void Floodcolor(int a[][],int r, int c, int toadd, int prevfill){
                int rows=a.length;
                int cols=a[0].length;
                if(r<0 || r>=rows|| c<0 || c>=cols){
                    return ;
                }
                if(a[r][c]!=prevfill){
                    return;
                }
                a[r][c]=toadd;
                Floodcolor(a, r-1, c, toadd, prevfill);
                Floodcolor(a, r, c-1, toadd, prevfill);
                Floodcolor(a, r+1, c, toadd, prevfill);
                Floodcolor(a, r, c+1, toadd, prevfill);
            }
            static void Printmat(int a[][]){
                for(int[] arrays: a){
                    for (int element: arrays){
                        System.out.print(element+" ");
                    }
                    System.out.println();
                }
            }
}

package Strings;

public class Anagram {
    public static void main(String[] args) {
        String a="aab";
        String b="aba";
       // boolean isanagram=false;
       boolean isanagram=true;
        boolean visited[]= new boolean[b.length()];

    //     if(a.length()==b.length()){

    //     for(int i=0;i<a.length();i++){
    //         char c=a.charAt(i);
    //         isanagram=false;
    //         for(int j=0;j<b.length();j++){

    //             if(b.charAt(j)==c && !visited[j]){
    //                 visited[j]=true;
    //                 isanagram=true;
    //                 break;
    //             }

    //         }
    //         if(!isanagram){
    //             break;
    //         }
    //     }

    // }
        int al[]=new int[256];
        int bl[]=new int[256];

        for(char c: a.toCharArray()){
            int index=(int)c;
            al[index]++;
        }

        for( char c: b.toCharArray()){
            int index=(int)c;
            bl[index]++;
        }
        for(int i=0;i<256;i++){
            if(al[i]!=bl[i]){
                isanagram=false;
                break;

            }
        }
    
        if(isanagram){
            System.out.println("anagram");
        }
        else System.out.println("not anagram");
    }
    
}

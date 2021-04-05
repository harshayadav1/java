package interfacee;

public class Person implements Youtuber,Student,Videoeditor {

   public void makevideo(){
       System.out.println("youtuber makes video");
   }
  public void study(){
       System.out.println("person is studying");
   }
  public void editvideo(){
       System.out.println("video editor edits video");
   }

    public static void main(String[] args) {
        Person obj= new Person();
        Youtuber obj2=obj;
      //  obj2.editvideo();
        obj2.makevideo();

    }
    
}

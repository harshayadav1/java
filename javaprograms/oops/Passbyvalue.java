package oops;

public class Passbyvalue {

    public static void main(String[] args) {
        // int c=35;
        // int d=20;

        // swap(c,d);
        // System.out.println(c + " " +d);

        // Dog c=new Dog();
        // c.legs=3;
        // Dog d=new Dog();
        // d.legs=4;
        // swap(c,d);

        Dog a=new Dog();
        a.legs=4;
        changedog(a);
        System.out.println(a.legs);



    }

    static void swap(Dog a, Dog b){
        Dog temp=a;
        a=b;
        b=temp;
    }

    static void changedog(Dog dog){
        dog.legs=6;

    }
    // static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    // }
    
}

class Dog {
    int legs;
}

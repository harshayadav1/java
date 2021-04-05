package oops;

class Vehicle{
    int wheels;
    int headlights;
    String color;
     Vehicle(int noofwheels){
         wheels=noofwheels;
     }

     Vehicle(int wheels, String color){
         this.wheels=wheels;
         this.color=color;
         headlights=2;
     }
}

public class Constructor {

    Constructor(){
        System.out.println("im harsha");
    }

    public static void main(String[] args) {

      Vehicle car= new Vehicle(12,"red");

      System.out.println(car.wheels +" wheels and color " +car.color);
        
    }
    
}

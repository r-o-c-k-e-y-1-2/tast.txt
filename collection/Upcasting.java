package collection;

//Upcasting

class Vehicle {
 void move() {
     System.out.println("Vehicle is moving");
 }
}


class Car extends Vehicle {
 @Override
 void move() {
     System.out.println("Car is driving");
 }
}


class Bike extends Vehicle {
 @Override
 void move() {
     System.out.println("Bike is riding");
 }
}

public class Upcasting {
 public static void main(String[] args) {
     // Upcasting: Car object assigned to Vehicle reference
     Vehicle v1 = new Car();
     // Upcasting: Bike object assigned to Vehicle reference
     Vehicle v2 = new Bike();

     Vehicle v = new Vehicle();
     
     v.move();
     v1.move();
     v2.move(); 
 }
}

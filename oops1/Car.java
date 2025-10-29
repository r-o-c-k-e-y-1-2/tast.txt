package oops1;

//Interface definition
interface Engine {
 void start();
}

//Base class
class Vehicle {
 void run() {
     System.out.println("Vehicle is running");
 }
}

public class Car extends Vehicle implements Engine {
 
 public void start() {
     System.out.println("Engine started");
 }

 public static void main(String[] args) {
     Car car = new Car();
     car.start();
     car.run();
 }
}
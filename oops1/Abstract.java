package oops1;

abstract class Vehicle3 {
	abstract void move();
}

class Bicycle extends Vehicle3 {
	void move() {
		System.out.println("Bicycle is moving");
	}
}

class Car2 extends Vehicle3 {
	void move() {
		System.out.println("Car is moving");
	}
}

public class Abstract {
	public static void main(String[] args) {
		Vehicle3 v1 = new Bicycle();
		Vehicle3 v2 = new Car2();
		v1.move();
		v2.move();
	}
}

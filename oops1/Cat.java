package oops1;

// hierarchical inheritance 
class Animal {
	void sound() {
		System.out.println("Comman animal sounds");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Bark");
	}

}

public class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		 Dog obj = new Dog();
		 Cat obj1 = new Cat();
		 
		 obj.sound();
		 obj1.sound();

	}
}

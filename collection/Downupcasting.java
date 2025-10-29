package collection;

public class Downupcasting {

	static class Computer {
		void compute() {
			System.out.println("Computer is computing");
		}
	}

	static class Desktop extends Computer {
		@Override
		void compute() {
			System.out.println("Desktop is computing fast");
		}

		void connectMonitor() {
			System.out.println("Desktop monitor connected");
		}
	}

	static class Laptop extends Computer {
		@Override
		void compute() {
			System.out.println("Laptop is computing efficiently");
		}
	}

	// upcasting and compute
	static void Upcasting() {
		Computer comp = new Desktop(); // Upcasting Desktop to Computer
		System.out.println("Upcasting:");
		comp.compute();
	}

	// downcasting and Desktop-specific method
	static void Downcasting() {
		Computer comp = new Desktop(); // Upcasting
		System.out.println("\nDowncasting and using Desktop-specific method:");
		if (comp instanceof Desktop) {
			Desktop desk = (Desktop) comp; // Downcasting
			desk.connectMonitor();
		}
	}

	// Method to show Laptop features (optional for completeness)
	static void showLaptopFeature() {
		Computer comp = new Laptop();
		System.out.println("\nLaptop Feature:");
		comp.compute();
		// No downcasting here, as we have no Laptop-only method in this example
	}

	public static void main(String[] args) {
		Upcasting(); // upcasting/polymorphism
		Downcasting(); // downcasting
		showLaptopFeature(); // Laptop also overrides compute()
	}
}

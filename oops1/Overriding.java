package oops1;


// Method overriding
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Circle();
        Shape s3 = new Rectangle();

        s1.draw(); 
        s2.draw();
        s3.draw(); 
    }
}


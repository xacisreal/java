class AreaCalculator {
    // Area of Circle
    double area(double radius) {
    return Math.PI * radius * radius;
    }
    // Area of Rectangle
    double area(double length, double breadth) {
    return length * breadth;
    }
    // Area of Triangle
    double area(double base, double height, boolean isTriangle) {
    return 0.5 * base * height;
    }
    }
    public class AreaDemo {
    public static void main(String[] args) {
    AreaCalculator ac = new AreaCalculator();
    System.out.println("Area of Circle: " + ac.area(5));
    System.out.println("Area of Rectangle: " + ac.area(4, 6));
    System.out.println("Area of Triangle: " + ac.area(4, 5, true));
    }
    }
public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape {
    double r;
    public Circle(double r) {
        this.r = r;
    }

}

public double area() {
    return 3.14 * r * r;
}

public double perimeter() {
    return 2 * 3.14 * r;
}

public void display() {
    System.out.println("area of circle:" + area());
    System.out.println("perimeter of circle:" + perimeter());
}

public static void main(String[] args) {
    Circle c = new Circle(4);
    c.display();
}

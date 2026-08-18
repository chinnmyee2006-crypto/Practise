public abstract class Shape {
    private String color;

    public Shape(String color){
        this.color
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();
}

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI* radius*radius
    }
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {

    }
}

public abstract class Shape {
    private String color;

    public Shape(String color){
        this.color
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();
}

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI* radius*radius
    }
}

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public class Main {
        public static void main(String[] args) {

        }
    }

}

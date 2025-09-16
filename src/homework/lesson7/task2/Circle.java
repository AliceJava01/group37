package homework.lesson7.task2;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * getArea();
    }
}

package homework.lesson7.task2;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimetr (){
        return 2 * (width + height);
    }
}

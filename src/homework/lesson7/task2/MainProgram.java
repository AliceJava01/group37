package homework.lesson7.task2;

public class MainProgram {
    public static void main(String[] args) {

        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(21, 14, 17);
        figures[1] = new Circle(12);
        figures[2] = new Rectangle(13, 23);
        figures[3] = new Rectangle(34, 43);
        figures[4] = new Circle(14);

        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.getPerimetr();
        }

        System.out.println(sum);
    }
}

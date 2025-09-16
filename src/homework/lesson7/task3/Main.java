package homework.lesson7.task3;

public class Main implements Cloneable {
    public void sayHello() {
        System.out.println("Привет");
    }
    public int sum(int a, int b) {
        return a + b;
    }
    @Override
    public Main clone() throws CloneNotSupportedException {
     return (Main) super.clone();
    }
}

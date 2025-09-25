package homework.lesson10.task2v2;

public class Pet implements Cloneable{
    private int age;
    private  String name;

    public Pet (int age, String name) {
        this.age = age;
        this.name = name;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

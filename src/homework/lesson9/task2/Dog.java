package homework.lesson9.task2;

public class Dog extends Animal {
    public static Dog dog = new Dog();

    private Dog() {
    }

    @Override
    public void voice() {
        System.out.println("Гав - гав");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meet")) {
            System.out.println("доволен");
        } else   {
            System.out.println("недоволен");
        }
    }
}

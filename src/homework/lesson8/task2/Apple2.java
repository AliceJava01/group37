package homework.lesson8.task2;

import java.lang.reflect.Field;

public class Apple2 {
    public static void main(String[] args) throws Exception{
        Apple apple = new Apple("красный");
        apple.printColor();

        Field colorFiled = Apple.class.getDeclaredField("color");
        colorFiled.setAccessible(true);
        colorFiled.set(apple, "зеленый");
        apple.printColor();
    }
}

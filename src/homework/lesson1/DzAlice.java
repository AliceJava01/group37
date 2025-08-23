package homework.lesson1;

public class DzAlice {
    public static void main(String[] args) {
        //Задача 1
        int b = 5;
        int c = 2;
        int a = 4 * (b + c - 1) / 2;
        System.out.println(a);

        // Задача 2
        int n = 28;
        int v = n / 10;
        int d = n % 10;
        System.out.println(v + d);

        // Задача 3
        int l = 134;
        int t = l / 100;
        int f = l % 10;
        int g = (l % 100) / 10;

        System.out.println(t + f + g);

        // Задача 4
        double n4 = 76.8;
        n4 = (int)n4;
        System.out.println(n4);
//        System.out.println((int)n4); // 76

        // Задача 5
        int q = 31;
        int w = 5;

        System.out.println(q / w + " и " + q % w);

        //Задача *
        int a6 = 1;
        int b6 = 2;
        a6 = a6 + b6;
        b6 = a6 - b6;
        a6 = a6 - b6;
        System.out.println(a6);
        System.out.println(b6);
    }
}
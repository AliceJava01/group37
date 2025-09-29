package homework.lesson11.taskWithStar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Дана строка произвольной длины с произвольными словами. Написать программу для
        //проверки является ли любое выбранное слово в строке палиндромом.
        //Например, есть строка, вводится число 3, значит необходимо проверить является ли 3-е
        //слово в этой строке палиндромом.
        //Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например,
        //в строке 5 слов, а на вход программе передали число 500.


        Scanner scan = new Scanner(System.in);
        String scanLine = scan.nextLine();
//        String scanLine = "run go,gog next,rotor goog";
        String[] words = scanLine.split("\\W");
        int scanInt = scan.nextInt();

        for (String word : words) {
            System.out.printf("[%s] ", word);
        }

        if (scanInt > 0 && scanInt <= words.length) {
            char[] charWord = words[scanInt - 1].toCharArray();
            boolean isPalindrome = true;
            int i = 0;
            int j = charWord.length - 1;

            while (i < j) {
                if (charWord[i] != charWord[j]) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }

            if (isPalindrome) {
                System.out.println("Слово " + words[scanInt - 1] + " под числом " + scanInt + " является палиндромом");
            } else {
                System.out.println("Слово " + words[scanInt - 1] + " под числом " + scanInt + " не является палиндромом");
            }

        } else {
            System.out.println("В строке " + words.length + " слов, а на вход программе передали число " + scanInt);
        }
    }
}

package homework.lesson14.task1;

import java.io.*;
import java.util.Scanner;

    public class FindLongestWord {
        public static void main(String[] args) {

            //Задача 1:
            //В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
            //Проанализировать и записать в другой файл самое длинное слово.

            // Объявляем переменные для хранения пути к файлам
            String inputPath = "C:\\Алиса Java\\fileInput\\romeo_and_juliet.txt";
            String outputPath = "C:\\Алиса Java\\fileOutput\\longest_word.txt";

            // Переменная для хранения самого длинного слова
            String longestWord = "";

            BufferedReader reader = null;

            try {
                // Создаем объект для чтения файла
                reader = new BufferedReader(new FileReader(inputPath));

                // Читаем файл построчно
                while (reader.ready()) {
                    String line = reader.readLine();

                    // Разбиваем строку на слова по пробелам
                    String[] words = line.split("\\s+");

                    // Проверяем каждое слово в строке
                    for (String word : words) {
                        // Если текущее слово длиннее сохраненного - обновляем
                        if (word.length() > longestWord.length()) {
                            longestWord = word;
                        }
                    }
                }

                // Записываем результат в выходной файл
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                    writer.write(longestWord);
                }

                System.out.println("Самое длинное слово: " + longestWord);

            } catch (FileNotFoundException e) {
                System.err.println("Файл не найден: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Ошибка при работе с файлом: " + e.getMessage());
            } finally {
                // Закрываем ридер
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        /*

если нужно прочитать файл по задаче, то читай из этого пути "C:\Алиса Java\fileInput"
если нужно записать файл по задаче, то записывай по этому пути "C:\Алиса Java\fileOutput"

*/
    }






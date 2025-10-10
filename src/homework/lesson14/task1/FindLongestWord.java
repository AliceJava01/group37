package homework.lesson14.task1;

import java.io.*;

    public class FindLongestWord {
        public static void main(String[] args) {

            //Задача 1:
            //В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
            //Проанализировать и записать в другой файл самое длинное слово.

            String inputPath = "C:\\Алиса Java\\fileInput\\romeo_and_juliet.txt";
            String outputPath = "C:\\Алиса Java\\fileOutput\\longest_word.txt";

            String longestWord = "";

            BufferedReader reader = null;

            try {
                reader = new BufferedReader(new FileReader(inputPath));

                while (reader.ready()) {
                    String line = reader.readLine();
                    String[] words = line.split("\\s+");
                    for (String word : words) {
                        if (word.length() > longestWord.length()) {
                            longestWord = word;
                        }
                    }
                }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                    writer.write(longestWord);
                }

                System.out.println("Самое длинное слово: " + longestWord);

            } catch (FileNotFoundException e) {
                System.err.println("Файл не найден: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Ошибка при работе с файлом: " + e.getMessage());
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }






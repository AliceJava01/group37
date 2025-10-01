package homework.lesson12.task2;

import java.util.regex.*;
import java.util.Scanner;

public class InfoExtractor {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите текст:");
        String input = console.nextLine();

        String emailPattern = "[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}";
        String docPattern = "\\d{4}-\\d{4}-\\d{2}";
        String phonePattern = "\\+\\(\\d{2}\\)\\d{7}";

        Pattern emailRegex = Pattern.compile(emailPattern);
        Pattern docRegex = Pattern.compile(docPattern);
        Pattern phoneRegex = Pattern.compile(phonePattern);

        Matcher emailMatcher = emailRegex.matcher(input);
        Matcher docMatcher = docRegex.matcher(input);
        Matcher phoneMatcher = phoneRegex.matcher(input);

        if (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }

        if (docMatcher.find()) {
            System.out.println("document number: " + docMatcher.group());
        }

        if (phoneMatcher.find()) {
            System.out.println("phone: " + phoneMatcher.group());
        }
    }
}
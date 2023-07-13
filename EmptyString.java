import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args) {
        try {
            String userInput = getUserInput();
            System.out.println("Вы ввели: " + userInput);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String getUserInput() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя");
        }

        return input;
    }
}
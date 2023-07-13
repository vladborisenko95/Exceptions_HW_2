import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args) {
        float userInput = getFloatInput();
        System.out.println("Вы ввели число: " + userInput);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");
            try {
                String input = scanner.nextLine().replace(',', '.');
                number = Float.parseFloat(input);

                // Проверяем, является ли число целым
                if (number == (int) number) {
                    System.out.println("Введено целое число. Пожалуйста, введите дробное число.");
                    continue; // Повторно запрашиваем ввод
                }

                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
            }
        }

        return number;
    }
}
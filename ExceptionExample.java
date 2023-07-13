import java.io.FileNotFoundException;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

   /*В этой версии кода я переставил блоки catch, чтобы Throwable (базовый класс для всех исключений)
   оказался в самом конце. Это позволяет обработать исключения NullPointerException и IndexOutOfBoundsException
   до того, как обработка пойдёт на уровень выше и попадёт в блок Throwable. Иначе, если исключение будет совпадать
   как с NullPointerException, так и с IndexOutOfBoundsException, сработает только блок Throwable, и
    более конкретные исключения не будут обработаны.
    */
}
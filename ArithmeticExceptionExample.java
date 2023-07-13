public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        handleArithmeticException();
    }

    public static void handleArithmeticException() {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        try {
            double d = 0;
            double catchedRes1;

            if (d != 0) {

                catchedRes1 = intArray[8] / d;
            } else {
                throw new ArithmeticException("Деление на ноль недопустимо");
            }

            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
package Exceptions;

public class Exceptions {

    public Exceptions(String x) {

    }

    private static int division(int a, int b) {
        int result = 0;
        try {
            result = (a / b);
        } catch (ArithmeticException x) {
            System.out.println(x.getMessage());
        }
        return result;
    }

    public static void arrType() {
        int[] numbers = new int[6];
        try {
            numbers[6] = 34;

        } catch (ArrayIndexOutOfBoundsException x) {
            System.out.println(x.getMessage());

        }
    }

    public static void illegalType() {
        try {
            Object i = Integer.valueOf(42);
            String s = (String) i;
        } catch (ClassCastException x) {
            System.out.println(x.getMessage());
        }
    }


    public static void main(String[] args) {
        float result = division(23, 0);
        System.out.println(result);
        arrType();
        illegalType();
    }
}

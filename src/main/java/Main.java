public class Main {
    public static void main(String[] args) {

        System.out.println(calculateSum(3, 5));
        System.out.println(multiply(2, 7));
        System.out.println(isEvenNumber(4));
        System.out.println(makeUppercase("hello klein"));
        System.out.println(checkIfPositive(-4));
    }

    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String makeUppercase(String word) {
        return word.toUpperCase();
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 != 1;
    }

    public static boolean checkIfPositive(int number) {
        return number > 0;
    }
}
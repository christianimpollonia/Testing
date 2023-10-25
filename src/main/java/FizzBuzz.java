import java.util.Scanner;

public class FizzBuzz {

    public static String fizzBuzz(int max) {
        String result = "";
        for (int i = 1; i < max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result = result + "Fizzbuzz ";
            } else if (i % 3 == 0) {
                result = result + "Fizz ";
            } else if (i % 5 == 0) {
                result = result + "Buzz ";
            } else {
                result = result + String.valueOf(i) + " ";
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a maximum");
        int max = scanner.nextInt();

        FizzBuzz.fizzBuzz(max);

        scanner.close();
    }
}
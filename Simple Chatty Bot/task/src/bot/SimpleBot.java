package bot;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SimpleBot {
    private final static Scanner scanner = new Scanner(System.in);
    private static final String BOT_NAME = "Anfisa";
    private static final int CREATION_YEAR = 2021;
    public static final int AGE_RANGE = 105;

    public static void main(String[] args) {
        greet(BOT_NAME, CREATION_YEAR);
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    private static void greet(String assistantName, int birthYear) {
        System.out.printf("Hello! My name is %s.\n", assistantName);
        System.out.printf("I was created in %d.\n", birthYear);
    }

    private static void remindName() {
        System.out.println("Please, remind me your name.");
        final var name = scanner.nextLine();
        System.out.printf("What a great name you have, %s!\n", name);
    }

    private static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        final var remainder3 = scanner.nextInt();
        final var remainder5 = scanner.nextInt();
        final var remainder7 = scanner.nextInt();

        final var age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % AGE_RANGE;

        System.out.printf("Your age is %d; that's a good time to start programming!\n", age);
    }

    private static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        IntStream.rangeClosed(0, scanner.nextInt()).forEach(n -> System.out.printf("%d!\n", n));
    }

    private static void test() {
        System.out.println("Let's test your programming knowledge.");
        final var correctAnswer = createTest();
        while (scanner.nextInt() != correctAnswer) {
            System.out.println("Please, try again.");
        }
    }

    private static int createTest() {
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        return 2;
    }

    private static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}

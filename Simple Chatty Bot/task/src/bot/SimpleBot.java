package bot;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SimpleBot {
    private static final String BOT_NAME = "Anfisa";
    private static final int CREATION_YEAR = 2021;
    public static final int AGE_RANGE = 105;

    public static void main(String[] args) {
        System.out.printf("Hello! My name is %s.\n", BOT_NAME);
        System.out.printf("I was created in %d.\n", CREATION_YEAR);
        System.out.println("Please, remind me your name.");

        // reading a name
        final var scanner = new Scanner(System.in);
        final var name = scanner.nextLine();

        System.out.printf("What a great name you have, %s!\n", name);
        
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        final var remainder3 = scanner.nextInt();
        final var remainder5 = scanner.nextInt();
        final var remainder7 = scanner.nextInt();

        final var age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % AGE_RANGE;

        System.out.printf("Your age is %d; that's a good time to start programming!\n", age);

        System.out.println("Now I will prove to you that I can count to any number you want.");

        // read a number and count to it here
        IntStream.rangeClosed(0, scanner.nextInt()).forEach(n -> System.out.printf("%d!\n", n));

        System.out.println("Completed, have a nice day!");

    }
}

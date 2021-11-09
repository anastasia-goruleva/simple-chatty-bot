package bot;

import java.util.Scanner;

public class SimpleBot {
    private static final String BOT_NAME = "Anfisa";
    private static final int CREATION_YEAR = 2021;

    public static void main(String[] args) {
        System.out.printf("Hello! My name is %s.\n", BOT_NAME);
        System.out.printf("I was created in %d.\n", CREATION_YEAR);
        System.out.println("Please, remind me your name.");

        // reading a name
        final var scanner = new Scanner(System.in);
        final var name = scanner.nextLine();

        System.out.printf("What a great name you have, %s!\n", name);
    }
}

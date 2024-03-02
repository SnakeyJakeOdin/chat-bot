import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // bot properties
        String botName = "Tech Buddy";
        int botYear = 2024;

        // greeting
        System.out.printf("Hello! My name is %s.%nI was created in %d.%n", botName, botYear);
        System.out.print("Please tell me your name: ");
        String name = scanner.next();
        System.out.printf("What a great name you have, %s.", name);

    }
}

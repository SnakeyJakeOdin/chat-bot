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

        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        // age guessing formula (valid from 0 to 104)
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!", age);

        // read a number and count up to it
        System.out.println("Give me a number and I will count up to it.");
        int maxNumber = scanner.nextInt();
        for (int i = 0; i <= maxNumber; i++) {
            System.out.println(i + "!");
        }

        // quiz the user
        System.out.println("Let's test your programming knowledge");
        String question = """
                What is the best programming language?
                1. Python
                2. Java
                3. Javascript
                4. C++
                """;
        System.out.println(question);
        int userResponse = scanner.nextInt();

        while (userResponse != 2) {
            System.out.println("Please, try again");
            userResponse = scanner.nextInt();
        }
    }
}

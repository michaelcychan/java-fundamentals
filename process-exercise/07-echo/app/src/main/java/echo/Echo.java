package echo;

import java.util.Scanner;

public class Echo {
    public void getEcho() {
        System.out.println("Say Something.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();
        System.out.println(userInput);
        scanner.close();
    }
}

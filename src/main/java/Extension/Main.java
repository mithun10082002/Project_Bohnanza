package Extension;

import java.util.*;

import static Extension.AlCabohne.playAlCabohne;
import static Extension.Game.playGame;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Play Original Game");
            System.out.println("2. Play Al Cabohne Extension");
            System.out.println("3. Cards");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    playGame(scanner);
                    break;
                case 2:
                    playAlCabohne(scanner);
                    break;
                case 3:
                    Cards.showCardDetails();
                    break;
                case 4:
                    System.out.println("Exiting the game. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

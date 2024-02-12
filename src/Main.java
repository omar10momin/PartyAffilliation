import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Print the menu for party affiliation selection
        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        // Read the user's choice
        System.out.print("Enter your choice: ");
        String choice = in.nextLine().toUpperCase();

        // Use cascaded if structure to respond accordingly
        if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You chose an option other than D, R, or I. You get Other.");
        }

        in.close();  // Close the Scanner object
    }
}

package day18_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String userAnswer = "";
        String shoppingList = "Your shopping list:\n\t";

        do {

            System.out.print("Enter name of the item: ");
            shoppingList += key.nextLine().trim() + "\n\t";

            System.out.print("Do you want to add more item (yes/no): ");
            userAnswer = key.next();
            key.nextLine();

        }while (userAnswer.equalsIgnoreCase("yes"));

        System.out.println(shoppingList);

    }
}

package day29_arraylist;

import java.util.*;


public class ShoppingList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();


        String userAnswer = "";
        do {
            System.out.print("Please, enter item name to add to the list: ");
            String itemToAdd = key.nextLine();

            shoppingList.add(itemToAdd);


            System.out.print("Do you want to add more: (y/n) ");
            userAnswer = key.nextLine(); // y

        } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));


        System.out.println("Shopping list has " + shoppingList.size() + " items in it.");
        for (String eachItem : shoppingList) {
            System.out.println("\t" + eachItem);
        }

        statusOfShoppingList(shoppingList);


        System.out.print("What item do you want to check if available in shopping list: ");
        String itemName = key.nextLine();  // item name: Apple

        itemAvailableInShoppingList(shoppingList, itemName);


        System.out.println("---------------------------------------------------");



        System.out.print("Do you want to remove any item: ");
        userAnswer = key.nextLine();
        if (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")) {

            System.out.print("What item do you want to remove: ");
            itemName = key.nextLine();  // "4"


            if (Character.isDigit(itemName.charAt(0))) {
                shoppingList.remove(Integer.parseInt(itemName) - 1);
            } else {
                shoppingList.remove(itemName);
            }


        }

        System.out.println("Final List: " + shoppingList);


    }

    public static void statusOfShoppingList (ArrayList <String> list) {
//        if (list.isEmpty()) {
//            System.out.println("Shopping list is empty");
//        } else {
//            System.out.println("There are some items in the shopping list");
//        }
        System.out.println(  list.isEmpty() ?  "Shopping list is empty" :  "There are some items in the shopping list");

    }


    public static void itemAvailableInShoppingList (ArrayList <String> list, String itemName){
        if (list.contains(itemName)){
            System.out.println(itemName + " is on the shopping list" );
        } else {
            System.out.println(itemName + " is not on the shopping list");
        }
    }

}
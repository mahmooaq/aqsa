/*
        Name:  [Aqsa Mahmood]
        Assignment:  [A3_Aqsa Mahmood]
        Program: [ItemListApp.java]
        Date:  [14-02-2020]
    
        Description:
        [This program collects the data about the items of different sizes and 
         displays the summary information about these items]
 */
package mahmooaq;

import java.util.*;

/**
 *
 * @author aksal
 */
public class ItemListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * calling the get confirm method to print the user interaction and
         * output on the screen.
         */
        ItemListApp.getConfirm();
        
    }

    /**
     * constructor for getter method for the size of item.
     *
     * @return the input by the user for the size of the item
     * @exception for the size format, if any other value will be entered
     * besides the constants for the size
     */
    public static String getSize() {

        Scanner input = new Scanner(System.in);
        boolean check = true;
        String userInput;

        do {
            userInput = input.next().toUpperCase();
            if (userInput.equalsIgnoreCase("XS") || userInput.equals("S")
                    || userInput.equals("M") || userInput.equals("L")
                    || userInput.equals("XL")) {
                check = true;
                return userInput;
            } else {
                System.out.println("Error! There is no such size!");
            }
            System.out.print("Enter Size Code: (XS|S|M|L|XL): ");

        } while (check);

        return userInput;
    }

    /**
     * getter method for the relative cost, this method validates the format of
     * the input.
     *
     * @return the base cost entered by the user
     * @exception throws an exception if a negative number or any other value is
     * entered besides number.
     */
    public static double getCost() {
        Scanner input = new Scanner(System.in);
        double f;
        try {
            f = input.nextDouble();
            if (f < 0) {
                System.out.print("The amount should be positive");
                System.out.print("\nEnter Item's Base Cost: ");
                f = getCost();
            }
        } catch (InputMismatchException e) {
            System.out.print("The value entered is not a number");
            System.out.print("\nEnter Item's Base Cost: ");
            f = getCost();
        }

        return f;
    }

    /**
     * an array list is created to store the items a loop is created to get the
     * item data for the item list. this loop will continue till the user does
     * not entered N or n. prompts the user to enter the size and base cost. all
     * the items entered are stored in the array list once all the items are
     * recorded
     */
    public static void getConfirm() {

        ItemList it = new ItemList();
        Scanner input = new Scanner(System.in);
        boolean x = true;

        do {
            System.out.print("Enter Size Code: (XS|S|M|L|XL): ");
            String s = getSize();
            System.out.print("Enter Item's Base Cost: ");
            double f = getCost();
            Item fi = new Item(Size.valueOf(s), f);
            it.add(fi);
            boolean exit = true;
            do {

                System.out.print("Would you like to enter another item (Y/N): ");
                String c = input.next();

                if (c.equalsIgnoreCase("Y")) {
                    x = true;
                    exit = false;
                } else if (c.equalsIgnoreCase("N")) {
                    x = false;
                    exit = false;
                } else {
                    System.out.println("Enter correct value");

                }
            } while (exit);
        } while (x);
        String main = "========================================";
        String heading = "Item Name    Base Cost   Item Cost";

        System.out.printf(
                "\n%s\n%s%n%s", main, heading, main);
        System.out.printf("");

        for (int i = 0; i < it.itemList.size(); i++) {
            System.out.print("\n" + it.itemList.get(i).toString());
        }
        System.out.println("");
        System.out.println("");
    }
}

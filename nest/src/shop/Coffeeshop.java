package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Coffeeshop {
    public static void main(String[] args) {
        int choice, mode;
        ArrayList<String> itemName = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();

        FoodItems foodItems = new FoodItems(6, 5, 10, 10, 8, 5);
        FoodItems takeawayFoodItems = new FoodItems(12, 17, 13, 14, 16, 12);

        HashMap<String, String> map = new HashMap<String, String>();
        ArrayList<String> transactionList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        outer:
        while (true) {

            System.out.println("Select an option");
            System.out.println("1. Dine");
            System.out.println("2. Takeaway");
            System.out.println("3. View Accounts");
            System.out.println("4. Exit");


            mode = sc.nextInt();
            int qty;
            switch (mode) {
                case 1:
                    while (true) {
                        System.out.println("1. Coffee " + foodItems.getCoffee());
                        System.out.println("2. Tea " + foodItems.getTea());
                        System.out.println("3. GreenTea " + foodItems.getGreenTea());
                        System.out.println("4. Cake " + foodItems.getCake());
                        System.out.println("5. Puffs " + foodItems.getPuffs());
                        System.out.println("6. Samosa " + foodItems.getSamosa());
                        System.out.println("7. Bill");
                        System.out.println("8. Exit");

                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Coffee");
                                quantity.add(qty);
                                price.add(qty * foodItems.getCoffee());
                                break;
                            case 2:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Tea");
                                quantity.add(qty);
                                price.add(qty * foodItems.getTea());
                                break;
                            case 3:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("GreenTea");
                                quantity.add(qty);
                                price.add(qty * foodItems.getGreenTea());
                                break;
                            case 4:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Cake");
                                quantity.add(qty);
                                price.add(qty * foodItems.getCake());
                                break;
                            case 5:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Puffs");
                                quantity.add(qty);
                                price.add(qty * foodItems.getPuffs());
                                break;
                            case 6:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Samosa");
                                quantity.add(qty);
                                price.add(qty * foodItems.getSamosa());
                                break;
                            case 7:
                                System.out.println("**********************************************");
                                System.out.println("CustomerName");
                                Scanner sc2 = new Scanner(System.in);
                                String s = sc2.next();
                                int sum = 0;
                                for (int i = 0; i <= itemName.size() - 1; i++) {
                                    System.out.println(itemName.get(i) + " " + quantity.get(i) + " " + price.get(i));
                                    sum += price.get(i);
                                }
                                System.out.println("Total bill is " + sum);

                                map.put("customer", s);
                                map.put("Amount", String.valueOf(sum));
                                map.put("Invoice", String.valueOf(Math.random()));
                                map.put("mode", "Dine In");
                                transactionList.add(String.valueOf(map));
                                //System.out.println(transactionList);
                                itemName.clear();
                                price.clear();
                                quantity.clear();
                                continue outer;


                            case 8:
                                continue outer;

                            default:
                                System.out.println("invalid choice");
                                break;
                        }
                    }
                case 2:
                    while (true) {
                        System.out.println("1. Coffee " + takeawayFoodItems.getCoffee());
                        System.out.println("2. Tea " + takeawayFoodItems.getTea());
                        System.out.println("3. GreenTea " + takeawayFoodItems.getGreenTea());
                        System.out.println("4. Cake " + takeawayFoodItems.getCake());
                        System.out.println("5. Puffs " + takeawayFoodItems.getPuffs());
                        System.out.println("6. Samosa " + takeawayFoodItems.getSamosa());
                        System.out.println("7. Bill");
                        System.out.println("8. Exit");

                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Coffee");
                                quantity.add(qty);
                                price.add(qty * takeawayFoodItems.getCoffee());
                                break;
                            case 2:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Tea");
                                quantity.add(qty);
                                price.add(qty * takeawayFoodItems.getTea());
                                break;
                            case 3:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("GreenTea");
                                quantity.add(qty);
                                price.add(qty * takeawayFoodItems.getGreenTea());
                                break;
                            case 4:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Cake");
                                quantity.add(qty);
                                price.add(qty * takeawayFoodItems.getCake());
                                break;
                            case 5:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Puffs");
                                quantity.add(qty);
                                price.add(qty * takeawayFoodItems.getPuffs());
                                break;
                            case 6:
                                System.out.println("Enter the Quantity");
                                qty = sc.nextInt();
                                itemName.add("Samosa");
                                quantity.add(qty);
                                price.add(qty * takeawayFoodItems.getSamosa());
                                break;
                            case 7:
                                System.out.println("**********************************************");
                                System.out.println("CustomerName");
                                Scanner sc2 = new Scanner(System.in);
                                String s = sc2.next();
                                int sum = 0;
                                for (int i = 0; i <= itemName.size() - 1; i++) {
                                    System.out.println(itemName.get(i) + " " + quantity.get(i) + " " + price.get(i));
                                    sum += price.get(i);
                                }
                                System.out.println("Total bill is " + sum);

                                map.put("customer", s);
                                map.put("Total", String.valueOf(sum));
                                map.put("Invoice", String.valueOf(Math.random()));
                                map.put("mode", "Take Away");
                                transactionList.add(String.valueOf(map));
                                itemName.clear();
                                quantity.clear();
                                price.clear();
                                continue outer;

                                //System.out.println(transactionList);

                            case 8:
                                continue outer;

                            default:
                                System.out.println("invalid choice");
                                break;
                        }
                    }

                case 3:
                    System.out.println("Transaction List");
                    for (int i = 0; i < transactionList.size(); i++) {
                        System.out.println(transactionList.get(i));
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;

            }

        }
    }
}




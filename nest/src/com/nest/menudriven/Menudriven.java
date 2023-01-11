package com.nest.menudriven;

import java.util.Scanner;

public class Menudriven {
    public static void main(String[] args) {

        int choice;
        System.out.println("Menu Driven");
        while(true){
            System.out.println("Select an option");
            System.out.println("1. Add Students");
            System.out.println("2. Search Students");
            System.out.println("3. Delete Students");
            System.out.println("4. View all Students");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Add Students is selected");
                    break;
                case 2 :
                    System.out.println("Search Students is selected");
                    break;
                case 3 :
                    System.out.println("Delete Student is selected");
                    break;
                case 4 :
                    System.out.println("View all students is selected");
                    break;
                case 5 :
                    System.exit(0);
            }
        }
    }
}

package bug;

import java.util.Scanner;

public class Bugfix {
    public static void main(String[] args) {

        System.out.println("Calculator");

        while(true)
        {
            System.out.println("Select a option");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            Scanner sc = new Scanner(System.in);
            int choice = sc .nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Addition is selected");
                    System.out.println(a+b);
                    break;
                case 2 :
                    System.out.println("Substraction is selected");
                    System.out.println(a-b);
                    break;
                case 3 :
                    System.out.println("Multiplication is selected");
                    System.out.println(a*b);
                    break;
                case 4 :
                    try {
                        System.out.println("Division is selected");
                        System.out.println(a / b);
                    }
                    catch (Exception e)
                    {
                        System.out.println("Division by Zero is not Possible");
                    }
                    break;
                case 5 :
                    System.exit(0);


            }
        }
    }
}
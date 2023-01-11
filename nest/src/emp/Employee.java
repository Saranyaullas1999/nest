package emp;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
        int choice;
        String empName;
        ArrayList<String> empList = new ArrayList<String>();


        while(true) {
            System.out.println("Select an Option");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Exit");

            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice)
            {
                case 1 :
                    System.out.println("Enter the name of an Employee :");
                    empName=sc.next();
                    empList.add(empName);
                    break;
                case 2 :
                    if(empList.size()==0)
                    {
                        System.out.println("No Employee Added");
                    }
                    else {
                        System.out.println(empList);
                    }
                    break;
                case 3 :
                    System.exit(0);

            }
        }

    }
}
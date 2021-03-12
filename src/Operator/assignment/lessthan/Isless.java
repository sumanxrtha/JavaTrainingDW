package Operator.assignment.lessthan;

import java.util.Scanner;

public class Isless {
    public void less() {
        System.out.println("enter a number");
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();

        System.out.println("Enter second number");
        int b = c.nextInt();

        if (a < b) {
            System.out.println("Your first number is grater or equal to second number");
        } else {
            System.out.println("Your second number is greater than first number");
        }
    }
}

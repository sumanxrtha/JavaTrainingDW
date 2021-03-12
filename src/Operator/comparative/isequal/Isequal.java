package Operator.comparative.isequal;

import java.util.Scanner;

public class Isequal {

    public void equal() {

        System.out.println("enter a number");
        Scanner c = new Scanner(System.in);
        int b = c.nextInt();

        System.out.println("Enter second number");
        int a = c.nextInt();

        if (a == b) {
            System.out.println("you typed same number");
        } else {
            System.out.println("Your fingers changed");
        }
    }
}

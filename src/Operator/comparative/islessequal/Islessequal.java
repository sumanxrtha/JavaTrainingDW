package Operator.comparative.islessequal;

import java.util.Scanner;

public class Islessequal {

    public void lessequal() {

        System.out.println("enter a number");
        Scanner c = new Scanner(System.in);
        int a = c.nextInt();

        System.out.println("ENTEr second number");
        int b = c.nextInt();

        if (a <= b) {
            System.out.println("Your second number is grater or equal to first number");
        } else {
            System.out.println("Your first number is greater than second number");
        }
    }
}

package Substraction;

import java.util.Scanner;

public class minus {

    public static void main(String[] args) {

        System.out.println("enter a number");
        Scanner c = new Scanner(System.in);
        int b = c.nextInt();

        System.out.println("ENTEr second number");
        int a = c.nextInt();


        if (a == b) {
            System.out.println("true");
        } else {
            System.out.println("not five");
        }
    }
}

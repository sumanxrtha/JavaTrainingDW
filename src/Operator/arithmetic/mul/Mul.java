package Operator.arithmetic.mul;

import java.util.Scanner;

public class Mul {

    int num1 = 0, num2 = 0;

    public void getinput() {
        System.out.println("Enter 1st number: ");
        Scanner aka = new Scanner(System.in);
        this.num1 = aka.nextInt();

        System.out.println("Enter 2nd number: ");
        this.num2 = aka.nextInt();
    }

    public void mathmul() {
        int d = this.num1 * this.num2;
        System.out.println("Total = " + d);
    }
}
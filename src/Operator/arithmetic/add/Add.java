package Operator.arithmetic.add;

import java.util.Scanner;

public class Add {

    int num1 = 0, num2 = 0;

    public void getinput(){
        System.out.println("Enter 1st number: ");
        Scanner aka = new Scanner(System.in);
        this.num1 = aka.nextInt();

        System.out.println("Enter 2nd number: ");
        this.num2 = aka.nextInt();
    }
    public void mathadd(){
        int d = this.num1 + this.num2;
        System.out.println("Total = " + d);
    }
}
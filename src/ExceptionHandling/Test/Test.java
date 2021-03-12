package ExceptionHandling.Test;

import java.util.Scanner;

public class Test {
    double a , b;
    public void add(){
        Scanner aka = new Scanner(System.in);
        System.out.println("enter the first number");
        a = aka.nextDouble();

        System.out.println("enter second number");
        b = aka.nextDouble();

        Double c = a + b;
        System.out.println("addition " + c);
    }
}

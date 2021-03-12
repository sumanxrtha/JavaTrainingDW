package Operator.logic.andop;

import java.util.Scanner;

public class And {
    public void simple() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a");
        int a = s.nextInt();
        System.out.println("enter b");
        int b = s.nextInt();
        if (a==6 && b==6){
            System.out.println("they are equal");
        }
        else{
            System.out.println("they are unequal");
        }
    }
}

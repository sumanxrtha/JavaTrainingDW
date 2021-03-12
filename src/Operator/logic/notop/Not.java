package Operator.logic.notop;

import java.util.Scanner;

public class Not {
    public void simple() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a");
        int a = s.nextInt();
        System.out.println("enter b");
        int b = s.nextInt();
        if (!(a==0 || b==0)){
            System.out.println("Both are null not null");
        }
        else{
            System.out.println("Both numbers maybe null");
        }
    }
}

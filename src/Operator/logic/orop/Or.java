package Operator.logic.orop;

import java.util.Scanner;

public class Or {
    public void simple() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a");
        int a = s.nextInt();
        System.out.println("enter b");
        int b = s.nextInt();
        if (a==0 || b==0){
            System.out.println("One or Both are null");
        }
        else{
            System.out.println("Both numbers are not null");
        }
    }
}

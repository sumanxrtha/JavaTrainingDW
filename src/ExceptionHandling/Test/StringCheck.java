package ExceptionHandling.Test;

import java.util.Scanner;

public class StringCheck {
    public void check(){
        Scanner aka = new Scanner(System.in);
        System.out.println("enter your name");
        String name = aka.nextLine();

        if (name.equals("suman")){
            System.out.println("valid");
        }
        else {
            System.out.println("not suman");
        }
    }
}

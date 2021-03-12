package Loop.Loop;

import java.util.Scanner;

public class For {
    public void forloop() {
        int i = 0, a = 0;  //local variable
        System.out.println("Starting point");
        Scanner ok = new Scanner(System.in);
        a = ok.nextInt();
        for (i = a; i <= 10; i++) {
            System.out.println("this is " + i);
        }
    }

}

package Loop.Loop.Switch;

import java.util.Scanner;

public class Switch {
    public void switchloop(){
        Scanner aka = new Scanner(System.in);
        System.out.println("Your number");
        int i = aka.nextInt();

        switch (i) {
            case 1:
                System.out.println("1");
                break;
            case 2,3,4,5,6,7:
                System.out.println("2 3 4 5 6 7");
                break;
            default:
                System.out.println("invalid greater than 7");
                break;

        }
    }
}

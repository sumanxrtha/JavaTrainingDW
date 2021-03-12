package Test;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        switch (a) {
            case 1, 3, 2, 4, 5:
                System.out.println("12345");
                break;
            case 6, 7, 8:
                System.out.println("678");
                break;
            case 9:
                System.out.println("9");
                break;
            default:
                System.out.println("no");
        }
    }
}



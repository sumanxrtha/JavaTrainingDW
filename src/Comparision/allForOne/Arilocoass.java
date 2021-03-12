package Comparision.allForOne;

import java.util.Scanner;

public class Arilocoass {

    Scanner aka = new Scanner(System.in);

    public void entrance() {
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("this is all for one");
        System.out.println("arithmetic: + - * / %");
        System.out.println("logic: && || !");
        System.out.println("comparision: >, <, >=, <=");
        System.out.println("assignment cant be done for '=' because it is used to assign value so can't show");
        System.out.println("---------------------------------------------------------------------------------");
    }

    //first number
    public double getfirst() {
        System.out.println("I need your first number");
        double num1 = aka.nextDouble();
        aka.nextLine();
        return num1;

    }

    //second number
    public double getsecond() {
        System.out.println("wow, please enter second number");
        double num2 = aka.nextDouble();
        aka.nextLine();
        return num2;
    }

    //operator input
    public String getOperator() {
        System.out.println("ok, now we need a operator");
        String operator = aka.nextLine();
        operator = operator.trim();
        return operator;
    }

    //all the code for handling operator
    public void mathematic(double num1, double num2, String operator, int option) {

        switch (option) {
            case 0:
                break;
            case 1:
                double c = 0;
                switch (operator) {
                    case "+":
                        c = num1 + num2;
                        System.out.println("the addition of your first and second number is " + c);
                        break;
                    case "-":
                        c = num1 - num2;
                        System.out.println("the substration of your first and second number is " + c);
                        break;
                    case "*":
                        c = num1 * num2;
                        System.out.println("the product of your first and second number is " + c);
                        break;
                    case "/":
                        if (num2 == 0) {
                            throw new ArithmeticException("can't divide because denominator is 0");
                        } else {
                            c = num1 / num2;
                            System.out.println("the division of your first by second number is " + c);
                        }
                        break;
                    case "%":

                        if (num2 == 0) {
                            throw new ArithmeticException("can't divide because denominator is 0");
                        } else{
                            c = num1 % num2;
                            System.out.println("the remainder after dividing first by second number is " + c);
                        }
                        break;
                }
                break;
            case 2:
                boolean bool;
                if (bool = (num1 == num2))
                    System.out.println("both numbers are equal");
                else if (bool = num1 > num2)
                    System.out.println("first number is greater than second number");

                else
                    System.out.println("second number is greater than first");
                break;
            case 3:
                boolean logic;
                switch (operator) {
                    case "&&":
                        if ((num1 % 2 == 0) && (num2 % 2 == 0))
                            System.out.println(num1 + " and " + num2 + "are both even");
                        else
                            System.out.println("'And' is false because one or both number are odd");
                        break;
                    case "||":
                        if ((num1 % 2 == 0) || (num2 % 2 == 0))
                            System.out.println("Or logic is true because " + num1 + " or " + num2 + " is even number");
                        else
                            System.out.println("Or logic is false because both number " + num1 + " and " + num2 + " are odd");
                        break;
                    case "!":
                        if (!(num1 == num2))
                            System.out.println("you have two different numbers");
                        else
                            System.out.println("you are lucky to get same number");
                        break;

                }
                break;
            case 4:
                switch (operator) {
                    case "==":
                        if (num1 == num2)
                            System.out.println("you got equal number i.e. == is true");
                        else
                            System.out.println("your both number are unequal i.e. == is false ");
                        break;
                    case "!=":
                        if (num1 != num2)
                            System.out.println("you got both number different i.e. != is true");
                        else
                            System.out.println("both number are equal and != is false");
                        break;
                }
                break;

        }


    }
}





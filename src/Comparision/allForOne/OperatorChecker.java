package Comparision.allForOne;

public class OperatorChecker {


    public int checker(String operatorarg) {
        String operatorc = operatorarg;
        switch (operatorc) {
            case "+", "-", "/", "*", "%":
                return 1;

            case "<", ">=", "<=", ">":
                return 2;

            case "&&", "||", "!":
                return 3;
            case "==", "!=":
                return 4;

            default:
                System.out.println("invalid operator");
                return 0;

        }

    }

}
package Comparision.allForOne;

public class Major {
    public static void main(String[] args) {
        Arilocoass arilocoass = new Arilocoass();
        arilocoass.entrance();

        //these are the operator and number
        double number1 = arilocoass.getfirst();
        String operatorm = arilocoass.getOperator();
        double number2 = arilocoass.getsecond();

        //checking for arithmetic logical comparision (no assignment) operator
        OperatorChecker operatorChecker = new OperatorChecker();
        int checkedoperator = operatorChecker.checker(operatorm);

        arilocoass.mathematic(number1, number2, operatorm, checkedoperator);

    }
}

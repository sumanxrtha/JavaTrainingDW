package ExceptionHandling.ThrowAndThrows;

public class Met {
    public void getAge(int age) throws ArithmeticException{
        if (age < 18){
            throw new ArithmeticException("this error");
        }
        else{
            System.out.println("elligible");
        }
    }
}

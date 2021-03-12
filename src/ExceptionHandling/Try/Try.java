package ExceptionHandling.Try;

public class Try {
    //exception handling
    public void getTry() {
        try {
            int a = 5, b = 0 ;
            int c = a / b;
        } catch (ArithmeticException eror) {
            eror.printStackTrace();
        }
        finally {
            System.out.println("it is always executed");
        }

    }
}

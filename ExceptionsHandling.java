
public class ExceptionsHandling {

    public static void main(String[] args) {
        /* 
        int d = 0;
        int a = 42 / d;
        System.err.println(a);
         */

        try {
            int d = 0;
            int a = 42 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.err.println(e);
            System.err.println("Division by zero");
        }
    }
}

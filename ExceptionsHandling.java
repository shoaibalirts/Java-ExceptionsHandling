
import java.util.Random;

public class ExceptionsHandling {

    public static void main(String[] args) {
        /* 
        int d = 0;
        int a = 42 / d;
        System.err.println(a);
         */
 /* 
        try {
            int d = 0;
            int a = 42 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.err.println(e);
            System.err.println("Division by zero");
        }
         */

        int a = 0, b = 0, c = 0;
        int d = 0;
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                System.out.println("b: " + b);
                System.out.println("c: " + c);
                d = b / c;
                System.out.println("d: " + d);
                a = 12345 / d;

            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
                a = 0;

            }
            System.out.println("a: " + a);
        }
    }
}

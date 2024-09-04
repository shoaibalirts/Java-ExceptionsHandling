
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsHandling {

    public static void main(String[] args) {
        try {
            method1();
        } catch (IOException e) {
            System.out.println("File not found");
        }

        /* 
        int d = 0;
        int a = 42 / d;
     ystem.err.println(a);
         */
 /* 
        try {
            int d = 0;
            int a = 42 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException e) {
            System.err.println(e);
         
     
         */
 /* 
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
         
     
         */
    }

    public static void method1() throws IOException {
        method2();
        // try {

        // } catch (Exception e) {
        // }
    }

    public static void method2() throws IOException {
        // try {
        FileReader fr = new FileReader("input.txt");
        //     System.out.println("File found" + fr);
        // } catch (Exception e) {
        //     System.out.println("File not found");
        // }
    }

}

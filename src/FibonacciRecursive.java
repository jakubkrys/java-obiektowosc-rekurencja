import java.util.Scanner;

public class FibonacciRecursive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int n = scanner.nextInt();

        Math2 math2 = new Math2(n);


        math2.fibonacci(n);
        math2.displayAll();
    }
}

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        while (true) {
            //pętla
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            int n = scanner.nextInt();

            long factorial = n;
            for (int i = n-1; i >= 1 ; i--) {
                factorial *= i;
            }
            System.out.println(n+"! = "+factorial);
            System.out.println();
            //rekurencja

            Math math = new Math();
            factorial = math.factorial(n);
            System.out.println(n+"! = "+factorial);
        }
    }
}

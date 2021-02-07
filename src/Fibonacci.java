import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //pętla
        while (true){
            System.out.println("Podaj liczbę:");
            int n = scanner.nextInt();

            long[] fibonacci = new long[n+1];
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            int m = 2;
            while (m < n+1){
                fibonacci[m] = fibonacci[m-1]+fibonacci[m-2];
                m++;
            }

            for (long f : fibonacci) {
                System.out.print(f+", ");
            }
            System.out.println();
            System.out.println("---------------------");
            System.out.println();

        }
    }
}

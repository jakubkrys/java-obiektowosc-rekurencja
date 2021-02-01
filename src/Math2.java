public class Math2 {
    int n;
    long[] fibonacci;

    Math2 (int n){
        fibonacci = new long[n+1];
    }

    long fibonacci(int n) {
        if (n == 0){
            fibonacci[n] = 0;
            return 0;
        } else if (n == 1) {
            fibonacci[n] = 1;
            return 1;
        } else {
            fibonacci[n] = fibonacci(n-1)+fibonacci(n-2);
            return fibonacci[n];
        }

    }

    void displayAll(){
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}

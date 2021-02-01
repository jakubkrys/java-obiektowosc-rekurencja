public class Math2 {
    int n;
    long[] fibonacci;

    Math2 (int n){
        fibonacci = new long[n];
    }

    long fibonacci(int n) {
        if (n > 0){
            return fibonacci(n-1)+fibonacci(n-2);
        } else {
            return 1;
        }

    }

    void add(){
        for (int i = 0; i < fibonacci.length; i++) {
            fibonacci[i] = n;
        }
    }

    void displayAll(){
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}

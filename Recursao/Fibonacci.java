public class Fibonacci {
  public static void main(String[] args) {
    long f = fibonacci(7);
    System.out.println(f);
    for (int i = 0; i <= 10; i++) {
      f = fibonacci(i);
      System.out.print(f + " ");
    }
  }

  public static long fibonacci(long n) {
    // base da recursão
    if (n < 2) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
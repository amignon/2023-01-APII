public class FibonacciProfundidade {
  public static void main(String[] args) {
    long p = pf(30);
    System.out.println("Profundidade: " + p);
  }

  public static long pf(long n) {
    // base da recursão
    if (n < 2) return 0;
    return pf(n - 1) + pf(n - 2) + 2;
  }
}

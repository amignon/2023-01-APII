public class MDC {
  public static void main(String[] args) {
    System.out.println("MDC = " + mdc(21, 12));
  }

  public static int mdc(int m, int n) {
    if (n == 0)
      return m;
    return mdc(n, m % n);
  }
}
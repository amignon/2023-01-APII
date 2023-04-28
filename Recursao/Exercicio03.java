public class Exercicio03 {
  public static void main(String[] args) {
    int p = potencia(3, 4);
    System.out.println(p);
  }

  public static int potencia(int a, int n) {
    // base da recursão
    if (n == 0)
      return 1;
    return a * potencia(a, n - 1);
  }
}

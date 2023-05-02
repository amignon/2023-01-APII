  public class Exercicio04 {
    public static void main(String[] args) {
      binario(13);
      System.out.println();
    }

    public static void binario(int n) {
      // base da recursão
      if (n < 2) {
        System.out.print(n);
        return; 
      }
      // passo da recursão
      binario(n / 2);
      System.out.print(n % 2);
    }
  }
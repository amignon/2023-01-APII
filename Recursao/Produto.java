public class Produto {
  public static void main(String[] args) {
    int p = produto(3, 4);
    System.out.println("Produto: " + p);   
  }

  public static int produto(int a, int b) {
    if (b == 1)
      return a;
    return produto(a, b - 1) + a;
  }
}

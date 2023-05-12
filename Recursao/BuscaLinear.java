public class BuscaLinear {
  public static void main(String[] args) {
    int[] v = {3, 7, 8, 11, 14, 18, 21, 25};
    int p = buscaLinear(v, 15, 0);
    System.out.println("Posição = " + p);
  }

  public static int buscaLinear(int[] v, int x, int i) {
    if (i == v.length)
      return -1;
    if (x == v[i])
      return i;
    return buscaLinear(v, x, i + 1);
  }
  
}

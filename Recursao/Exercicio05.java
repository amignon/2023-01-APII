public class Exercicio05 {
  public static void main(String[] args) {
    int[] v = {4, 6, 1, 8};
    int s = soma(v, 0);
    System.out.printf("Soma = %d\n", s);
    int m = menor(v, v.length);
    System.out.printf("Menor = %d\n", m);
    double media = media(v, 0);
    System.out.printf("Media = %.2f\n", media); 
  }

  public static int menor(int[] v, int i) {
    if (i == 1)
      return v[0];
    int x = menor(v, i - 1);
    if (x < v[i - 1])
      return x;
    return v[i - 1];
  }

  public static int soma(int[] v, int i) {
    if (i == v.length)
      return 0;
    return v[i] + soma(v, i + 1);
  }

  public static double media(int[] v, int i) {
    if (i == v.length)
      return 0;
    double s = v[i] + media(v, i + 1);
    if (i == 0) 
      return s / v.length;
    return s;
  }
}

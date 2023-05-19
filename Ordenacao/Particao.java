import java.util.Arrays;
public class Particao {
  public static void main(String[] args) {
    int[] v = {5, 6, 2, 7, 9, 1, 8, 3, 7};
    System.out.println(Arrays.toString(v));
    int p = particao(v);
    System.out.printf("Posição: %d\n", p);
    System.out.println(Arrays.toString(v));
  }

  public static int particao(int[] v) {
    int pivo = v[0];
    int i = 1;
    int j = v.length - 1;
    int aux;
    while (i <= j) {
      if (v[i] <= pivo)
        i++; // sobe o i
      else if (v[j] > pivo) {
        j--; // desce o j
      }
      else {
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
        i++;
        j--;
      }
    }
    v[0] = v[j];
    v[j] = pivo;
    return j;
  }
}

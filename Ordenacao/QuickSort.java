import java.util.Arrays;
public class QuickSort {
  public static void main(String[] args) {
    int[] v = {5, 6, 2, 7, 9, 1, 8, 3, 7};
    quickSort(v, 0, v.length - 1);
    System.out.println(Arrays.toString(v)); 
  }

  public static void quickSort(int[] v, int p, int r) {
    if (p < r) {
      int pivo = particao(v, p, r);
      quickSort(v, p, pivo - 1);
      quickSort(v, pivo + 1, r);
    }
  }

  public static int particao(int[] v, int p , int r) {
    int c = v[p]; // pivo
    int i = p + 1;
    int j = r;
    int aux;
    while (i <= j) {
      if (v[i] <= c)
        i++;
      else if (v[j] > c)
        j--;
      else { // troca
        aux = v[i];
        v[i] = v[j];
        v[j] = aux;
      }
    }
    v[p] = v[j];
    v[j] = c;
    return j;
  }
}

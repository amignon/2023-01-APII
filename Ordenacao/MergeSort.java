import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int[] vetor = {9, 5, 3, 6, 4, 7, 2, 8, 1};
    mergeSort(vetor, 0, vetor.length);
    System.out.println(Arrays.toString(vetor));
  }

  public static void mergeSort(int[] v, int p, int n) {
    if (p < n - 1) {
      int q = (p + n) / 2;
      mergeSort(v, p, q);
      mergeSort(v, q, n);
      intercala(v, p, q, n);
    }
  }

  public static void intercala(int[] v, int p, int q, int n) {
    int[] w = new int[n - p];
    int i = p;
    int j = q;
    int k = 0;
    while (i < q && j < n) {
      if (v[i] <= v[j]) {
        w[k] = v[i];
        i++;
      }
      else {
        w[k] = v[j];
        j++;
      }
      k++;
    }
    while (i < q) {
      w[k] = v[i];
      i++;
      k++;
    }
    while (j < n) {
      w[k] = v[j];
      j++;
      k++;
    }
    for (int x = p, y = 0; x < n; x++, y++) {
      v[x] = w[y];
    }
  }
}

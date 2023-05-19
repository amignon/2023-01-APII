import java.util.Arrays;

public class Intercalacao {
  public static void main(String[] args) {
    int[] a = {1, 3, 6, 7};
    int[] b = {2, 4, 5};
    int[] c = intercala(a, b);
    System.out.println(Arrays.toString(c));
  }

  public static int[] intercala(int[] a, int[] b) {
    int[] c = new int[a.length + b.length];
    int i = 0; // percorre a
    int j = 0; // percorre b
    int k = 0; // percorre c
    while (i < a.length && j < b.length) {
      if (a[i] < b[j]) {
        c[k] = a[i];
        i++;
      }
      else {
        c[k] = b[j];
        j++;
      }
      k++;
    }
    while (i < a.length) {
      c[k] = a[i];
      i++;
      k++;
    }
    while (j < b.length) {
      c[k] = b[j];
      j++;
      k++;
    }
    return c;
  }
}

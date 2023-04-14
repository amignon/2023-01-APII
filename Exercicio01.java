import java.io.File;
import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) throws Exception {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Nome do arquivo: ");
    String nomeArquivo = teclado.nextLine();
    processar(nomeArquivo);
  }

  public static void processar(String nomeArquivo) throws Exception {
    File arquivo = new File(nomeArquivo);
    Scanner leitor = new Scanner(arquivo);
    String linha;
    while (leitor.hasNextLine()) {
      linha = leitor.nextLine();
      System.out.println(linha);
    }
    leitor.close();
  }
}
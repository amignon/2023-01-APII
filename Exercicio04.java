import java.io.File;
import java.util.Scanner;

public class Exercicio04 {
  public static void main(String[] args) throws Exception {
    File arquivo = new File("alunos.txt");
    Scanner leitor = new Scanner(arquivo);
    String nomeMaiorNota = "";
    double maiorNota = 0.0;
    double somaNotas = 0.0;
    int qtdeNotas = 0;
    while (leitor.hasNextLine()) {
      String linha = leitor.nextLine();
      String[] dados = linha.split(";");
      double nota = Double.parseDouble(dados[1]);
      qtdeNotas++;
      somaNotas += nota;
      if (qtdeNotas == 1 || nota > maiorNota) {
        maiorNota = nota;
        nomeMaiorNota = dados[0];
      }
    }
    double media = somaNotas / qtdeNotas;
    System.out.printf("Média das notas %.1f\n", media);
    System.out.printf("Nome da maior nota: %s\n", nomeMaiorNota);
    System.out.printf("Maior nota: %.1f\n", maiorNota);
  }
}

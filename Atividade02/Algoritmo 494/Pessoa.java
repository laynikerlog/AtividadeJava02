import java.util.Scanner;

public class Pessoa {

  private String nome;
  private String endereco;
  private String profissao;

  public Pessoa(String nome, String endereco, String profissao) {
    this.nome = nome;
    this.endereco = endereco;
    this.profissao = profissao;
  }

  public String getNome() {
    return nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public String getProfissao() {
    return profissao;
  }

  public String toString() {
    return nome + " " + endereco + " " + profissao;
  }

  public static void troca(Pessoa[] vetor, int i, int j) {
    Pessoa temp = vetor[i];
    vetor[i] = vetor[j];
    vetor[j] = temp;
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      Pessoa[] pessoas = new Pessoa[3];

      for (int i = 0; i < 3; i++) {
        System.out.println("Digite nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite endereco:");
        String endereco = scanner.nextLine();

        System.out.println("Digite profissao:");
        String profissao = scanner.nextLine();

        pessoas[i] = new Pessoa(nome, endereco, profissao);
      }

      bubbleSort(pessoas);

      for (Pessoa pessoa : pessoas) {
        System.out.println(pessoa);
      }
    }
  }

  public static void bubbleSort(Pessoa[] vetor) {
    int n = vetor.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (vetor[j].getNome().compareTo(vetor[j + 1].getNome()) > 0) {
          troca(vetor, j, j + 1);
        }
      }
    }
  }
}

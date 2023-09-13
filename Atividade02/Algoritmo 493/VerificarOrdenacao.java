import javax.swing.JOptionPane;

public class VerificarOrdenacao {

  public static void main(String[] args) {
    // Solicita ao usuário o tamanho do vetor
    String tamanhoStr = JOptionPane.showInputDialog("Digite o tamanho do vetor:");
    int tamanho = Integer.parseInt(tamanhoStr);

    // Cria um vetor com o tamanho especificado pelo usuário
    int[] vetor = new int[tamanho];

    // Solicita ao usuário os elementos do vetor
    for (int i = 0; i < tamanho; i++) {
      String elementoStr = JOptionPane.showInputDialog("Digite o elemento " + (i + 1) + " do vetor:");
      int elemento = Integer.parseInt(elementoStr);
      vetor[i] = elemento;
    }

    // Chama a função para verificar a ordenação
    verificarOrdenacao(vetor);
  }

  public static void verificarOrdenacao(int[] vetor) {
    boolean crescente = true;
    boolean decrescente = true;

    // Verifica se o vetor está ordenado de forma crescente
    for (int i = 1; i < vetor.length; i++) {
      if (vetor[i] < vetor[i - 1]) {
        crescente = false;
        break;
      }
    }

    // Verifica se o vetor está ordenado de forma decrescente
    for (int i = 1; i < vetor.length; i++) {
      if (vetor[i] > vetor[i - 1]) {
        decrescente = false;
        break;
      }
    }

    // Verifica o resultado e imprime na tela
    if (crescente) {
      JOptionPane.showMessageDialog(null, "O vetor está ordenado de forma crescente.");
    } else if (decrescente) {
      JOptionPane.showMessageDialog(null, "O vetor está ordenado de forma decrescente.");
    } else {
      JOptionPane.showMessageDialog(null, "O vetor não está ordenado.");
    }
  }
}

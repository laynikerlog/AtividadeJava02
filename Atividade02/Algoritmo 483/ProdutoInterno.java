import javax.swing.JOptionPane;

public class ProdutoInterno {

    public static int calcularProdutoInterno(int[] vetor1, int[] vetor2) {
        if (vetor1.length != vetor2.length) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho");
        }

        int produtoInterno = 0;

        for (int i = 0; i < vetor1.length; i++) {
            produtoInterno += vetor1[i] * vetor2[i];
        }

        return produtoInterno;
    }

    public static void main(String[] args) {
        // Solicitar ao usuário que insira o tamanho dos vetores
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores:"));

        // Solicitar ao usuário que insira os elementos dos vetores
        String inputVetor1 = JOptionPane.showInputDialog("Digite os elementos do vetor 1 separados por espaço:");
        String inputVetor2 = JOptionPane.showInputDialog("Digite os elementos do vetor 2 separados por espaço:");

        String[] strVetor1 = inputVetor1.split(" ");
        String[] strVetor2 = inputVetor2.split(" ");

        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];

        // Verificar se os tamanhos dos vetores coincidem
        if (strVetor1.length != tamanho || strVetor2.length != tamanho) {
            JOptionPane.showMessageDialog(null,
                    "A quantidade de elementos inseridos não corresponde ao tamanho indicado.");
            return;
        }

        // Converter os elementos de string para int
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = Integer.parseInt(strVetor1[i]);
            vetor2[i] = Integer.parseInt(strVetor2[i]);
        }

        // Calcular o produto interno
        int resultado = calcularProdutoInterno(vetor1, vetor2);

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O produto interno dos vetores é: " + resultado);
    }
}

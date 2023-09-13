import javax.swing.JOptionPane;
import java.util.Arrays;

public class MenuVetor {

    private static int[] vetor = new int[5];

    public static void main(String[] args) {
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU VETOR - FUNCAO\n" +
                            "1. Dados do VETOR\n" +
                            "2. Ordena VETOR\n" +
                            "3. Imprime VETOR\n" +
                            "4. Sai do programa\n" +
                            "OPÇÃO:"
            ));

            switch (opcao) {
                case 1:
                    dadosDoVetor();
                    break;
                case 2:
                    ordenaVetor();
                    break;
                case 3:
                    imprimeVetor();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
    }

    public static void dadosDoVetor() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " + (i + 1) + ":"));
        }
    }

    public static void ordenaVetor() {
        Arrays.sort(vetor);
        JOptionPane.showMessageDialog(null, "Vetor ordenado: " + Arrays.toString(vetor));
    }

    public static void imprimeVetor() {
        JOptionPane.showMessageDialog(null, "Vetor: " + Arrays.toString(vetor));
    }
}

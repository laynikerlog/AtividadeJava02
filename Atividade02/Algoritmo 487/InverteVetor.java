import javax.swing.JOptionPane;

public class InverteVetor {

    public static void inverte(int[] vetor, int tamanho) {
        for (int i = 1; i <= tamanho / 2; i++) {
            int temp = vetor[i - 1];
            vetor[i - 1] = vetor[tamanho - i];
            vetor[tamanho - i] = temp;
        }
    }

    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));

        int[] vetor = new int[tamanho];

        for (int i = 1; i <= tamanho; i++) {
            vetor[i - 1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " + i + ":"));
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }

        inverte(vetor, tamanho);

        System.out.println("\nVetor invertido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}

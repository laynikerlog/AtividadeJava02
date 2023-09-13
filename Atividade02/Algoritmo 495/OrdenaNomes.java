import javax.swing.JOptionPane;
import java.util.Arrays;

public class OrdenaNomes {

    public static void ordenarNomes(String[] nomes) {
        Arrays.sort(nomes);
    }

    public static void main(String[] args) {
        String[] nomes = new String[5];

        // Preencher o vetor de nomes
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite um nome:");
        }

        // Chamar a função para ordenar os nomes
        ordenarNomes(nomes);

        // Exibir os nomes ordenados
        JOptionPane.showMessageDialog(null, "Nomes ordenados: " + Arrays.toString(nomes));
    }
}

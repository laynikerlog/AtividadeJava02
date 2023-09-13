import javax.swing.JOptionPane;

public class ImpressaoCaracteres {

    public static void imprimirCaracteres(int[] numeros, char[] caracteres) {
        for (int i = 0; i < numeros.length; i++) {
            int repeticoes = numeros[i];
            char caractere = caracteres[i];

            for (int j = 0; j < repeticoes; j++) {
                System.out.print(caractere);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho dos vetores:"));

        int[] numeros = new int[tamanho];
        char[] caracteres = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":"));
        }

        for (int i = 0; i < tamanho; i++) {
            caracteres[i] = JOptionPane.showInputDialog("Digite o caractere " + (i + 1) + ":").charAt(0);
        }

        imprimirCaracteres(numeros, caracteres);
    }
}

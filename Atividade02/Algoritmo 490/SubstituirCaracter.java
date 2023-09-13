import javax.swing.JOptionPane;

public class SubstituirCaracter {

    public static String substituirCaractere(String palavra, char caractere) {
        return palavra.replace(caractere, '*');
    }

    public static void main(String[] args) {
        int tamanho = 10;
        String[] palavras = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            palavras[i] = JOptionPane.showInputDialog("Digite a palavra " + (i + 1) + " em letras minúsculas:");
        }

        char caractereSubstituir = JOptionPane.showInputDialog("Digite o caractere a ser substituído:").charAt(0);

        for (int i = 0; i < tamanho; i++) {
            String palavraSubstituida = substituirCaractere(palavras[i], caractereSubstituir);
            System.out.println((i + 1) + " - " + palavraSubstituida);
        }
    }
}

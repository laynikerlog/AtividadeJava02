import javax.swing.JOptionPane;

public class ConversorBase {

    public static String convertToBase(int numero, int base) {
        if (base < 2 || base > 10) {
            throw new IllegalArgumentException("A base deve estar entre 2 e 10");
        }

        StringBuilder resultado = new StringBuilder();

        while (numero > 0) {
            int resto = numero % base;
            resultado.insert(0, resto);
            numero /= base;
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        // Solicitar ao usuário que insira o número
        String inputNumero = JOptionPane.showInputDialog("Digite o número para converter:");
        int numero = Integer.parseInt(inputNumero);

        // Solicitar ao usuário que escolha a base
        String inputBase = JOptionPane.showInputDialog("Digite a base para a conversão (entre 2 e 10):");
        int base = Integer.parseInt(inputBase);

        // Chamar a função de conversão
        String resultado = convertToBase(numero, base);

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O número " + numero + " na base " + base + " é: " + resultado);
    }
}

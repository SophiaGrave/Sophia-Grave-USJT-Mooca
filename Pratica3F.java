import javax.swing.JOptionPane;
public class Pratica3F 
{
    public static void main(String[] args) 
    {
        // Ler até o valor -999 ser digitado
        while (true) 
        {
            // Fala para o usuário digitar um número 
            String input = JOptionPane.showInputDialog("Digite um número (ou -999 para encerrar):");

            // Converte a entrada para um inteiro
            int numero = Integer.parseInt(input);

            // Verifica se o número -999 foi digitado para encerrar 
            if (numero == -999) 
            {
                break;  // Sai do loop se o número for -999
            }

            // Calcula e exibe a raiz quadrada se o número for positivo
            if (numero >= 0) 
            {
                double raizQuadrada = Math.sqrt(numero);
                JOptionPane.showMessageDialog(null, "Raiz quadrada de " + numero + ": " + raizQuadrada);
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível calcular a raiz quadrada de número negativo.");
            }

            // Calcula e exibe o inverso se o número não for zero
            if (numero != 0) {
                double inverso = 1.0 / numero;  // Calcula o inverso
                JOptionPane.showMessageDialog(null, "Inverso de " + numero + ": " + inverso);
            } else {
                JOptionPane.showMessageDialog(null, "O número 0 não tem inverso.");
            }
        }
    }
}

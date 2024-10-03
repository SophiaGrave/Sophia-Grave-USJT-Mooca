import javax.swing.JOptionPane;

public class Pratica3R 
{
    public static void main(String[] args) 
    {
        // Fala para o usuario digitar um numero para calcular o fatorial 
        String numeroTexto = JOptionPane.showInputDialog("Digite um número para calcular o fatorial:");
        int numero = Integer.parseInt(numeroTexto);

        // Valor do fatorial como 1
        long fatorial = 1;

        // Calcula o fatorial multiplicando os números de 1 até o valor digitado
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        // Cria uma mensagem com o resultado do fatorial
        String mensagem = "O fatorial de " + numero + " é " + fatorial;

        // Resultado do fatorial 
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

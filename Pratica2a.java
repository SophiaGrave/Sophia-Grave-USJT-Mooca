import javax.swing.JOptionPane;
public class Pratica2a
{
    public static void main(String[] args) 
    {
        // Ler os dois valores 
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor inteiro:"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor inteiro:"));

        // Acrescentar a adição
        int soma = valor1 + valor2;

        // Verificar se a soma é maior que 10
        if (soma > 10) {
            JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        }
    }
}

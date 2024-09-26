import javax.swing.JOptionPane;
public class Pratica2b
{
    public static void main(String[] args) 
    {
        // Ler os dois números
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Acrescentar a adição
        int soma = numero1 + numero2;

        // Verifica se a soma é menor ou igual a 20
        if (soma <= 20) {
            soma -= 5; // Subtrai 5 da soma
        }

        //  Resultado
        JOptionPane.showMessageDialog(null, "O resultado é: " + soma);
    }
}

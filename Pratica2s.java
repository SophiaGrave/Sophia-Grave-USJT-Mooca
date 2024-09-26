import javax.swing.JOptionPane;
public class Pratica2s
{
    public static void main(String[] args) 
    {
        // Ler o primeiro numero
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Ler o segundo numero
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Imprime os numeros em ordem decrescente
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "Os números em ordem decrescente são: " + numero1 + " e " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "Os números em ordem decrescente são: " + numero2 + " e " + numero1);
        }
    }
}

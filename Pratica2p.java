import javax.swing.JOptionPane;
public class Pratica2p
{
    public static void main(String[] args) 
    {
        // Ler o primeiro numero 
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Ler o segundo numero
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Ver se os numeros sao iguais ou diferentes 
        if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "Os números " + numero1 + " e " + numero2 + " são iguais.");
        } else {
            JOptionPane.showMessageDialog(null, "Os números " + numero1 + " e " + numero2 + " são diferentes.");
        }
    }
}

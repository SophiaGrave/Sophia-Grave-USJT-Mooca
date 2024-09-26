import javax.swing.JOptionPane;
public class Pratica2i
{
    public static void main(String[] args) 
    {
        // Ler o numero
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Ver se o numero e multiplo de 3
        if (numero % 3 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é múltiplo de 3.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é múltiplo de 3.");
        }
    }
}

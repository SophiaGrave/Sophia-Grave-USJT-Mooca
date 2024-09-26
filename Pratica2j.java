import javax.swing.JOptionPane;
public class Pratica2j 
{
    public static void main(String[] args) 
    {
        // Ler o numero
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Ver se o numero e divisivel por 5
        if (numero % 5 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 5.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 5.");
        }
    }
}

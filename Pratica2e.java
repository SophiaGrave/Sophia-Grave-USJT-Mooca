import javax.swing.JOptionPane;
public class Pratica2e
{
    public static void main(String[] args) 
    {
        // Ler o numero 
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Ver se o numero esta entre 20 e 90
        if (numero >= 20 && numero <= 90) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " está entre 20 e 90.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não está entre 20 e 90.");
        }
    }
}

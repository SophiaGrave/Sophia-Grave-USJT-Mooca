import javax.swing.JOptionPane;
public class Pratica2f
{
    public static void main(String[] args) 
    {
        // ler o numero
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Ver a relação do numero com 20
        if (numero > 20) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é maior do que 20.");
        } else if (numero == 20) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é igual a 20.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é menor do que 20.");
        }
    }
}

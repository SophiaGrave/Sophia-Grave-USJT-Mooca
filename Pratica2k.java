import javax.swing.JOptionPane;
public class Pratica2k
{
    public static void main(String[] args) 
    {
        // Ler o numero
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Ver se o numero e divisivel por 3 e por 7
        boolean divisivelPorTres = (numero % 3 == 0);
        boolean divisivelPorSete = (numero % 7 == 0);

        if (divisivelPorTres && divisivelPorSete) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 3 e por 7.");
        } else if (divisivelPorTres) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 3, mas não por 7.");
        } else if (divisivelPorSete) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 7, mas não por 3.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível nem por 3 nem por 7.");
        }
    }
}

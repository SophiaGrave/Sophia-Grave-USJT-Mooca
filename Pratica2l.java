import javax.swing.JOptionPane;
public class Pratica2l 
{
    public static void main(String[] args) 
    {
        // Ler o numero
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        // Ver se e divisivel por 10, 5 e 2
        boolean divisivelPorDez = (numero % 10 == 0);
        boolean divisivelPorCinco = (numero % 5 == 0);
        boolean divisivelPorDois = (numero % 2 == 0);

        if (divisivelPorDez) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 10.");
        } else if (divisivelPorCinco) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 5.");
        } else if (divisivelPorDois) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é divisível por 2.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é divisível por 10, 5 ou 2.");
        }
    }
}

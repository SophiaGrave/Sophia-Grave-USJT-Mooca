import javax.swing.JOptionPane;
public class Pratica2r
{
    public static void main(String[] args) 
    {
        // Ler o primeiro numero
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Ler o segundo numero
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Imprimir os numeros em ordem crescente 
        if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + numero1 + " e " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "Os números em ordem crescente são: " + numero2 + " e " + numero1);
        }
    }
}

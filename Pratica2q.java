import javax.swing.JOptionPane;
public class Pratica2q 
{
    public static void main(String[] args) 
    {
        // Ler o primeiro numero 
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Ler o segundo numero 
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Ver qual e o menor 
        int menor = (numero1 < numero2) ? numero1 : numero2;

        // Mostra o menor 
        JOptionPane.showMessageDialog(null, "O menor número é: " + menor);
    }
}

import javax.swing.JOptionPane;
public class Pratica2h 
{
    public static void main(String[] args) 
    {
        // Ler os dois numeros
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Ver qual o maior
        int maior = (numero1 > numero2) ? numero1 : numero2;

        // Mostrar o maior numero
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}

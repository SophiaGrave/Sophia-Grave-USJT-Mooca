import javax.swing.JOptionPane;
public class Pratica3H 
{
    public static void main(String[] args) 
    {
        long produto = 1; // neutro para multiplicação

        // Loop para calcular o produto dos numeros de 120 a 300
        for (int i = 120; i <= 300; i++) {
            produto *= i; // Multiplica o numero atual ao produto
        }

        // Resultado 
        JOptionPane.showMessageDialog(null, "O produto de todos os numeros de 120 a 300 é: " + produto);
    }
}

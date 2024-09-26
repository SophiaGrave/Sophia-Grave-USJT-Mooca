import javax.swing.JOptionPane;
public class Pratica3G 
{
    public static void main(String[] args) 
    {
        String resultado = ""; // Variável para armazenar os multiplos de 5

        // Loop para encontrar os multiplos de 5 entre 1 e 500
        for (int i = 1; i <= 500; i++) 
        {
            if (i % 5 == 0) { // Verifica se o numero e multiplo de 5
                resultado += i + "\n"; // Adiciona o número à string
            }
        }

        // Resultado de todos os numeros multiplos de 5 
        JOptionPane.showMessageDialog(null, "Múltiplos de 5 entre 1 e 500:\n" + resultado);
    }
}

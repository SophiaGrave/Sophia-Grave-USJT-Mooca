import javax.swing.JOptionPane;
public class Pratica3J
{
    public static void main(String[] args) 
    {
        while (true) 
        {
            // Fala para o usuario digitar um numero 
            String input = JOptionPane.showInputDialog("Digite um número (ou -999 para encerrar):");
            int numero = Integer.parseInt(input); 

            // Verifica se o numero e -999 para encerrar o loop
            if (numero == -999) 
            {
                break; // Encerra o loop
            }

            // Divisores do numero
            StringBuilder divisores = new StringBuilder("Divisores de " + numero + ": ");
            for (int i = 1; i <= numero; i++) 
            {
                if (numero % i == 0) { // Verifica se 'i' é divisor de 'numero'
                    divisores.append(i).append(" "); // Adiciona o divisor à string
                }
            }

            // Resultado dos divisores 
            JOptionPane.showMessageDialog(null, divisores.toString());
        }
    }
}

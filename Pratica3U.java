import javax.swing.JOptionPane;
public class Pratica3U 
{
    public static void main(String[] args) 
    {
        // Fala para o usuário digitar o limite superior do intervalo
        String limiteTexto = JOptionPane.showInputDialog("Digite o limite superior do intervalo:");
        int limite = Integer.parseInt(limiteTexto);

        // Cria uma variável para armazenar os números ímpares
        String numeros = "";

        // Laço para os numeros ímpares menores que o limite
        for (int i = 1; i < limite; i += 2) 
        {
            numeros += i;

            // Adiciona uma vírgula e um espaço se não for o ultimo numero
            if (i + 2 < limite) 
            {
                numeros += ", ";
            }
        }

        // Resultado 
        JOptionPane.showMessageDialog(null, numeros);
    }
}

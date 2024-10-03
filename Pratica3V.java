import javax.swing.JOptionPane;
public class Pratica3V 
{
    public static void main(String[] args) 
    {
        // Fala para o usuário digitar a quantidade de numeros pares que serão impressos
        String quantidadeTexto = JOptionPane.showInputDialog("Digite quantos números pares deseja imprimir:");
        int quantidade = Integer.parseInt(quantidadeTexto);

        // Cria uma variável para armazenar os numeros pares
        String numeros = "";

        // Laço para a quantidade de numeros pares a partir de 2
        int numeroPar = 2;
        for (int i = 1; i <= quantidade; i++) 
        {
            numeros += numeroPar;

            // Adiciona uma vírgula e um espaço se não for o ultimo numero
            if (i < quantidade) 
            {
                numeros += ", ";
            }

            // Incrementa o numero par
            numeroPar += 2;
        }

        // Resultado
        JOptionPane.showMessageDialog(null, numeros);
    }
}

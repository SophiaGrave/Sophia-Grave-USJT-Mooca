import javax.swing.JOptionPane;
public class Pratica3T 
{
    public static void main(String[] args) 
    {
        String resultado = "Pessoas do sexo masculino com mais de 21 anos:\n";

        // Laço para ler os dados de 20 pessoas
        for (int i = 1; i <= 20; i++)
        {
            // Digita o nome da pessoa
            String nome = JOptionPane.showInputDialog("Digite o nome da pessoa " + i + ":");

            // Digita a idade da pessoa
            String idadeTexto = JOptionPane.showInputDialog("Digite a idade de " + nome + ":");
            int idade = Integer.parseInt(idadeTexto);

            // Digita o sexo da pessoa (M para masculino, F para feminino)
            String sexo = JOptionPane.showInputDialog("Digite o sexo de " + nome + " (M para masculino, F para feminino):");

            // Verifica se a pessoa é do sexo masculino e tem mais de 21 anos
            if (sexo.equalsIgnoreCase("M") && idade > 21) 
            {
                resultado += nome + "\n";
            }
        }

        // Mostra o resultado com os nomes das pessoas que atendem aos critérios
        JOptionPane.showMessageDialog(null, resultado);
    }
}

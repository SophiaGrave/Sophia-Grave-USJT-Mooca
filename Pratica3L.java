import javax.swing.JOptionPane;
public class Pratica3L 
{
    public static void main(String[] args) 
    {
        int totalMenor21 = 0;  // Para pessoas com menos de 21 anos 
        int totalMaior50 = 0;  // Para pessoas com menos de 50 anos 

        while (true) 
        {
            // Solicita a idade da pessoa
            String input = JOptionPane.showInputDialog("Digite a idade da pessoa (Digite uma idade fora da faixa 0-120 para encerrar):");
            int idade = Integer.parseInt(input);

            // Verifica se a idade está fora da faixa 0-120 para encerrar o programa
            if (idade < 0 || idade > 120) 
            {
                break;
            }

            // Pessoas com menos de 21 anos mais soma  
            if (idade < 21) 
            {
                totalMenor21++;
            }

            // Pessoas com menos de 50 anos mais soma 
            if (idade > 50) {
                totalMaior50++;
            }
        }

        // Exibir o total de pessoas nas faixas de idade
        JOptionPane.showMessageDialog(null, "Total de pessoas com menos de 21 anos: " + totalMenor21 +
                                            "\nTotal de pessoas com mais de 50 anos: " + totalMaior50);
    }
}

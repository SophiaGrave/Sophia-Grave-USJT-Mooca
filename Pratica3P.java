import javax.swing.JOptionPane;
public class Pratica3P
{
    public static void main(String[] args) 
    {
        // Cria uma variável para armazenar a tabela 
        String tabela = "Tabela Conversão de Polegadas para Centímetros:\n";

        // Laço dos valores de 1 a 20
        for (int polegadas = 1; polegadas <= 20; polegadas++) 
        {
            // Calcula o valor em centímetros
            double centimetros = polegadas * 2.54;
            
            // Adiciona a conversão ao texto da tabela
            tabela += polegadas + " in = " + centimetros + " cm\n";
        }

        // Resultado da tabela 
        JOptionPane.showMessageDialog(null, tabela, "Conversão de Polegadas para Centímetros", JOptionPane.INFORMATION_MESSAGE);
    }
}

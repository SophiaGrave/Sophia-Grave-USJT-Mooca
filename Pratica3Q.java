import javax.swing.JOptionPane;
public class Pratica3Q
{
    public static void main(String[] args) 
    {
        // Cria uma variável para armazenar a tabela 
        String tabela = "Tabela Conversão de Graus Celsius para Graus Fahrenheit";
        
        // Fala para o usuario colocar o limite inferior 
        String limiteInferiorTexto = JOptionPane.showInputDialog("Digite o limite inferior em Celsius:");
        int limiteInferior = Integer.parseInt(limiteInferiorTexto);

        // Fala para o usuario colocar o limite superior 
        String limiteSuperiorTexto = JOptionPane.showInputDialog("Digite o limite superior em Celsius:");
        int limiteSuperior = Integer.parseInt(limiteSuperiorTexto);

        // Fala para o usuario colocar o valor do incremento 
        String incrementoTexto = JOptionPane.showInputDialog("Digite o incremento:");
        int incremento = Integer.parseInt(incrementoTexto);
        
         // Laço para percorrer os valores de Celsius
        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) 
        {
            // Calcula o valor em Fahrenheit
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
           
            // Adiciona a conversão ao texto da tabela
            tabela += celsius + " °C = " + fahrenheit + " °F\n";   
      }
      
            // Exibe a tabela em uma janela
            JOptionPane.showMessageDialog(null, tabela, "Conversão de Graus Celsius para Graus Fahrenheit", JOptionPane.INFORMATION_MESSAGE);
   }
}
        
     
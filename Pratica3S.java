import javax.swing.JOptionPane;
public class Pratica3S 
{
    public static void main(String[] args) 
    {
        // Fala para o usuário digitar o limite superior do intervalo
        String limiteTexto = JOptionPane.showInputDialog("Digite o limite superior do intervalo:");
        int limite = Integer.parseInt(limiteTexto);

        // Fala para o usuário digitar o valor do incremento
        String incrementoTexto = JOptionPane.showInputDialog("Digite o incremento:");
        int incremento = Integer.parseInt(incrementoTexto);

        // Cria uma variável para armazenar os números do intervalo
        String numeros = "";

        // Começa no 0 e vai até o limite, adicionando o incremento a cada passo
        int i = 0;
        while (i <= limite) 
        {
            // Adiciona o número atual a variável 'numeros'
            numeros += i;

            // Se ainda houver outro número a ser adicionado, coloca uma vírgula e espaço
            if (i + incremento <= limite) 
            {
                numeros += ", ";
            }
            
             // Incrementa o valor de 'i' pelo valor do incremento
            i = i + incremento;
 
        }

        // Resultado
        JOptionPane.showMessageDialog(null, numeros);
    }
}

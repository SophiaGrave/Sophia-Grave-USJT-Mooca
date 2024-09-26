import javax.swing.JOptionPane;
public class Pratica3E
{
    public static void main(String[] args) 
    {
        while (true) 
        {
            // Fala para o usuario digitar um nome 
            String nome = JOptionPane.showInputDialog("Digite um nome (ou 'FIM' para encerrar):");

            // Verifica se o nome digitado e "FIM"
            if (nome.equalsIgnoreCase("FIM")) 
            {
                break; // Sai do loop se o nome for "FIM"
            }

            // Imprime o nome
            JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
        }
    }
}


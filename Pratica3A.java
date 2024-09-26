import javax.swing.JOptionPane;
public class Pratica3A
{
    public static void main(String[] args) 
    {
        // Inicializar uma string para guardar
        String contagem = "";

        // Contar de 100 a 1
        for (int i = 100; i >= 1; i--) {
            contagem += i + "\n"; }

        // Imprimir a contagem regressiva em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, contagem, "Contagem Regressiva", JOptionPane.INFORMATION_MESSAGE);
    }
}


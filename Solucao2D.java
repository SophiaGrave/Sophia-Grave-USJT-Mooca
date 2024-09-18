import javax.swing.JOptionPane;

public class PesoDoUsuarioSOlucao2D
{
    public static void main(String[] amor) 
    {
        // Coloque o seu peso 
        String entrada = JOptionPane.showInputDialog("Digite seu peso em kg:");
        double peso = Double.parseDouble(entrada); 

        // Exiba o peso informado
        System.out.println("O peso informado foi " + peso + " kg.");
    }
}

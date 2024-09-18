import javax.swing.JOptionPane;

public class StringEmJOptionPaneMaisSomaSolucao1D
{
    public static void main(String[] chocolate) 
    {
        // Leia três Strings usando JOptionPane
        String sAltura = JOptionPane.showInputDialog("Digite a primeira String:");
        String sPeso = JOptionPane.showInputDialog("Digite a segunda String:");
        String sLargura = JOptionPane.showInputDialog("Digite a terceira String:");

        // Calcule a soma dos comprimentos das Strings
        int somaComprimentos = (sAltura != null ? sAltura.length() : 0) +
                               (sPeso != null ? sPeso.length() : 0) +
                               (sLargura != null ? sLargura.length() : 0);

        // Exiba o resultado usando JOptionPane
        JOptionPane.showMessageDialog(null, "A soma dos comprimentos das Strings é: " + somaComprimentos);
    }
}

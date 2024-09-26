import javax.swing.JOptionPane;
public class Pratica2n
{
    public static void main(String[] args) 
    {
        // Ler numero de 4 digitos 
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de 4 dígitos:"));

        // Ver se o numero temos 4 digitos 
        if (numero < 1000 || numero > 9999) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número de 4 dígitos.");
            return; }

        // Extrai os algarismos da casa das unidades de milhar e das centenas                                     
        int unidadeDeMilhar = numero / 1000; 
        int centenas = (numero / 100) % 10; 

        // Montar o numero a partir das casas das unidades de milhar e das centenas
        int numeroFormado = unidadeDeMilhar * 10 + centenas;

        // Ver se o numero e multiplo de 4
        if (numeroFormado % 4 == 0) {
            JOptionPane.showMessageDialog(null, "O número " + numeroFormado + " é múltiplo de 4.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numeroFormado + " não é múltiplo de 4.");
        }
    }
}

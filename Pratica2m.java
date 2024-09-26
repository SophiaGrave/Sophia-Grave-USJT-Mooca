import javax.swing.JOptionPane;
public class Pratica2m 
{
    public static void main(String[] args) 
    {
        // Um numero inteiro de 3 dígitos
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de 3 dígitos:"));

        // Conferir se o numero tem 3 digitos
        if (numero < 100 || numero > 999) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número de 3 dígitos.");
            return; }

        // Tirar o algarismo da casa das dezenas
        int algarismoDasDezenas = (numero / 10) % 10;

        // Conferir se o algarismo da casa das dezenas e par ou impar
        if (algarismoDasDezenas % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas (" + algarismoDasDezenas + ") é par.");
        } else {
            JOptionPane.showMessageDialog(null, "O algarismo da casa das dezenas (" + algarismoDasDezenas + ") é ímpar.");
        }
    }
}

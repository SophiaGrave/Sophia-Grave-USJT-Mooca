import javax.swing.JOptionPane;
public class Pratica2c 
{
    public static void main(String[] args) 
    {
        // Ler um numero 
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));

        // Ver se o nmero e positivo ou negativo
        if (numero > 0) {
        
            // Calcular a raiz quadrada
            double raizQuadrada = Math.sqrt(numero);
            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é: " + raizQuadrada);
        } else {
        
            // Calcular o quadrado do número
            double quadrado = numero * numero;
            JOptionPane.showMessageDialog(null, "O quadrado de " + numero + " é: " + quadrado);
        }
    }
}

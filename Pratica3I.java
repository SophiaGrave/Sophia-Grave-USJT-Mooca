import javax.swing.JOptionPane;
public class Pratica3I 
{
    public static void main(String[] args) 
    {
        int soma = 0; // Variavel para armazenar a soma

        // Cria uma String para armazenar os numeros
        StringBuilder numeros = new StringBuilder();

        // Loop para imprimir os numeros de 1 a 100 e calcular a soma
        for (int i = 1; i <= 100; i++) {
            numeros.append(i).append("\n"); 
            soma += i; 
        }

        // Resultado da soma e dos numeros 
        JOptionPane.showMessageDialog(null, "Números de 1 a 100:\n" + numeros.toString() + "Soma: " + soma);
    }
}

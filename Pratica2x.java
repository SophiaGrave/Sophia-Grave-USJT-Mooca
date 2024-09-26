import javax.swing.JOptionPane;
public class Pratica2x  
{
    public static void main(String[] args) 
    {
        // Armazenar o maior e o menor numero
        int maior = 0; 
        int menor = 0; 

        // Ler o primeiro numero 
        int primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número:"));
        maior = primeiroNumero; 
        menor = primeiroNumero;

        // Ler os proximos 4 numeros 
        for (int i = 2; i <= 5; i++) 
        {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º número:"));

            // Verifica se e maior que o atual numero maior
            if (numero > maior) {
                maior = numero; }

            // Verifica se e menor que o atual numero menor
            if (numero < menor) {
                menor = numero; }
        }

        // Resultado
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior + "\nO menor número é: " + menor);
    }
}

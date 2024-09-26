import javax.swing.JOptionPane;
public class Pratica3C 
{
    public static void main(String[] args) 
    {
        int soma = 0; 
        int contador = 0; 

        while (true) 
        {
            // Ler um numero 
            String input = JOptionPane.showInputDialog("Digite um numero positivo (ou um numero negativo para sair):");
            int numero = Integer.parseInt(input); 

            // Se o numero for negativo sai do loop
            if (numero < 0) {
                break; 
            }

            // Adiciona o numero mais o contador 
            soma += numero;
            contador++;
        }

        // Calcula e mostra a media dos numeros 
        if (contador > 0) {
            double media = (double) soma / contador; 
            JOptionPane.showMessageDialog(null, "A media dos numeros digitados e: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum numero positivo foi digitado.");
        }
    }
}

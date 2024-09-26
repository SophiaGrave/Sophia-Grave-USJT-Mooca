import javax.swing.JOptionPane;
public class Pratica3M 
{
    public static void main(String[] args) 
    {
        // Numero do usuario
        String input = JOptionPane.showInputDialog("Digite um número:");
        
        // Converter para o numero interiro 
        int numero = Integer.parseInt(input);
        
        // Verificar se é numero primo
        boolean resultado = ehPrimo(numero);
        
        // Mostrar o resultado em uma caixa de diálogo
        if (resultado) 
        {
            JOptionPane.showMessageDialog(null, numero + " é um número primo.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " não é um número primo.");
        }
    }
    
    // Função para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        // Números menores ou iguais a 1 não são primos
        if (num <= 1) {
            return false;
        }
        
        // Verificar se o número é divisível por qualquer número de 2 até num-1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // Se for divisível, não é primo
            }
        }
        
        return true; // Se não for divisível por nenhum, é primo
    }
}

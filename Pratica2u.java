import javax.swing.JOptionPane;
public class Pratica2u 
{
    public static void main(String[] args) 
    {
        // Ler o primeiro numero 
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Ler o segundo numero
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Ler o terceiro numero 
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        // Colocar o maior numero como primeiro 
        int maior = numero1;

        // Ver se o segundo e maior 
        if (numero2 > maior) {
            maior = numero2;
        }

        // Ver se o terceiro e maior 
        if (numero3 > maior) {
            maior = numero3;
        }

        // Mostrar o maior de todos 
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
    }
}

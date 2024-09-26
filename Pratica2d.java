import javax.swing.JOptionPane;
public class Pratica2d 
{
    public static void main(String[] args) 
    {
        // Ler os tres numeros 
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        // Lendo para armazenar os numeros em ordem
        int menor, intermediario, maior;

        // Verificando e colocando os numeros em ordem 
        if (num1 < num2 && num1 < num3) {
            menor = num1;
            if (num2 < num3) {
                intermediario = num2;
                maior = num3;
            } else {
                intermediario = num3;
                maior = num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            if (num1 < num3) {
                intermediario = num1;
                maior = num3;
            } else {
                intermediario = num3;
                maior = num1;
            }
        } else {
            menor = num3;
            if (num1 < num2) {
                intermediario = num1;
                maior = num2;
            } else {
                intermediario = num2;
                maior = num1;
            }
        }

        // Expor os numeros em ordem crescente
        JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + menor + ", " + intermediario + ", " + maior);
    }
}

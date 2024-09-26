import javax.swing.JOptionPane;
public class Pratica2w
{
    public static void main(String[] args) 
    {
        // Ler o primeiro numero 
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Ler o segundo numero 
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Ler o terceiro numero 
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        // Variaveis
        int maior, intermediario, menor;

        // Escolhendo o maior numero 
        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
            if (numero2 > numero3) {
                intermediario = numero2;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero2;
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
            if (numero1 > numero3) {
                intermediario = numero1;
                menor = numero3;
            } else {
                intermediario = numero3;
                menor = numero1;
            }
        } else {
            maior = numero3;
            if (numero1 > numero2) {
                intermediario = numero1;
                menor = numero2;
            } else {
                intermediario = numero2;
                menor = numero1;
            }
        }

        // Resultado
        JOptionPane.showMessageDialog(null, "Maior: " + maior + "\nIntermediário: " + intermediario + "\nMenor: " + menor);
    }
}

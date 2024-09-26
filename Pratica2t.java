import javax.swing.JOptionPane;
public class Pratica2t 
{
    public static void main(String[] args) 
    {
        // Ler o primeiro numero
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Ler o segundo numero
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Verifica qual e o menor e qual e o maior
        int menor = (numero1 < numero2) ? numero1 : numero2;
        int maior = (numero1 > numero2) ? numero1 : numero2;

        // Calcular o quadrado do menor numero
        int quadradoMenor = menor * menor;

        // Calcular a raiz quadrada do maior numero, se der
        double raizMaior = Math.sqrt(maior);

        // Resultado
        JOptionPane.showMessageDialog(null, "O quadrado do menor número (" + menor + ") é: " + quadradoMenor);
        JOptionPane.showMessageDialog(null, "A raiz quadrada do maior número (" + maior + ") é: " + raizMaior);
    }
}

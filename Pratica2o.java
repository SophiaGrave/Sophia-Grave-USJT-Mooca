import javax.swing.JOptionPane;
public class Pratica2o
{
    public static void main(String[] args) 
    {
        // Ler o ano de nascimento
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
        
        // Ler o ano atual
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));

        // Ver se o ano de nascimento e certo
        if (anoNascimento <= 0 || anoNascimento > anoAtual) {
            JOptionPane.showMessageDialog(null, "Ano de nascimento inválido. Por favor, digite um ano válido.");
            return;  }

        // Calcular a idade
        int idade = anoAtual - anoNascimento;

        // Resultado
        JOptionPane.showMessageDialog(null, "A idade da pessoa é: " + idade + " anos.");
    }
}

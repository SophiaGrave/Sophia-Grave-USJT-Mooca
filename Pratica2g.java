import javax.swing.JOptionPane;
public class Pratica2g 
{
    public static void main(String[] args) 
    {
        // Ler o nome da pessoa
        String nome = JOptionPane.showInputDialog("Digite o seu nome:");

        // Ler o sexo da pessoa
        char sexo = JOptionPane.showInputDialog("Digite o seu sexo (f para feminino, m para masculino):").charAt(0);

        // Ler a idade da pessoa
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade:"));

        // Verifica as condições de aceitação
        if ((sexo == 'f' || sexo == 'F') && idade < 25) {
            JOptionPane.showMessageDialog(null, nome + ", ACEITA.");
        } else {
            JOptionPane.showMessageDialog(null, nome + ", NÃO ACEITA.");
        }
    }
}

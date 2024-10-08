import javax.swing.JOptionPane;
public class TurmaTeste
{
    public static void main(String[] args) 
    {
        // Pedindo o nome da turma
        String nome = JOptionPane.showInputDialog("Digite o nome da Turma:");
        
        // Pedindo o curso da turma
        String curso = JOptionPane.showInputDialog("Digite o curso da Turma:");
        
        // Pedindo a quantidade de alunos (convertendo para inteiro)
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
        
        // Pedindo a série da turma (convertendo para inteiro)
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a série da Turma:"));

        // Criando um objeto da classe Turma com os dados fornecidos
        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        // Dados da turma
        JOptionPane.showMessageDialog(null, 
            "Dados da Turma:\n" +
            "Nome: " + turma.getNome() + "\n" +
            "Curso: " + turma.getCurso() + "\n" +
            "Quantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\n" +
            "Série: " + turma.getSerie());

        // Mudando os valores
        turma.setNome(JOptionPane.showInputDialog("Digite o novo nome da Turma:"));
        turma.setCurso(JOptionPane.showInputDialog("Digite o novo curso da Turma:"));
        turma.setQuantidadeDeAlunos(Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos:")));
        turma.setSerie(Integer.parseInt(JOptionPane.showInputDialog("Digite a nova série da Turma:")));

        // Mostrando os novos dados da turma
        JOptionPane.showMessageDialog(null, 
            "Novos dados da Turma:\n" +
            "Nome: " + turma.getNome() + "\n" +
            "Curso: " + turma.getCurso() + "\n" +
            "Quantidade de Alunos: " + turma.getQuantidadeDeAlunos() + "\n" +
            "Série: " + turma.getSerie());
    }
}

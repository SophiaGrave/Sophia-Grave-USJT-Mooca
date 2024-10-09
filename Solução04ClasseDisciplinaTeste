import javax.swing.JOptionPane;
public class DisciplinaTeste
{
    public static void main(String[] args) 
    {
        // Pedindo o nome da disciplina
        String nome = JOptionPane.showInputDialog("Digite o nome da Disciplina:");
        
        // Pedindo o nome do professor
        String professor = JOptionPane.showInputDialog("Digite o nome do Professor:");
        
        // Pedindo o semestre (convertendo para inteiro)
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre da Disciplina:"));
        
        // Pedindo se a disciplina é ofertada (convertendo para boolean)
        int ofertadaOpcao = JOptionPane.showConfirmDialog(null, "A disciplina está sendo ofertada?", "Ofertada", JOptionPane.YES_NO_OPTION);
        boolean ofertada = (ofertadaOpcao == JOptionPane.YES_OPTION);

        // Criando um objeto da classe Disciplina com os dados fornecidos
        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        // Mostrando os dados da disciplina criada
        JOptionPane.showMessageDialog(null, 
            "Disciplina Criada:\n" +
            "Nome: " + disciplina.getNome() + "\n" +
            "Professor: " + disciplina.getProfessor() + "\n" +
            "Semestre: " + disciplina.getSemestre() + "\n" +
            "Ofertada: " + (disciplina.isOfertada() ? "Sim" : "Não"));
    }
}

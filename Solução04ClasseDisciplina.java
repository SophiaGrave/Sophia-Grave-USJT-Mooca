public class Disciplina 
{
    // Atributos
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;

    // Construtor
    public Disciplina(String n, String p, int s, boolean o) {
        nome = n;
        professor = p;
        semestre = s;
        ofertada = o;
    }

    // Métodos de acesso 
    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public int getSemestre() {
        return semestre;
    }

    public boolean isOfertada() {
        return ofertada;
    }

    // Métodos modificadores 
    public void setNome(String n) {
        nome = n;
    }

    public void setProfessor(String p) {
        professor = p;
    }

    public void setSemestre(int s) {
        semestre = s;
    }

    public void setOfertada(boolean o) {
        ofertada = o;
    }
}

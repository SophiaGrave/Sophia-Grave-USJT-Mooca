import java.util.ArrayList;

public class BlocoDeNotas 
{
    private ArrayList<String> notas;

    // Construtor
    public BlocoDeNotas() {
        this.notas = new ArrayList<>();
    }

    // Método para adicionar uma nota
    public void adicionarNota(String nota) {
        notas.add(nota);
    }

    // Método para remover uma nota (por índice)
    public boolean removerNota(int indice) {
        if (indice >= 0 && indice < notas.size()) {
            notas.remove(indice);
            return true;
        }
        return false;
    }

    // Método para buscar uma nota (por índice)
    public String buscarNota(int indice) {
        if (indice >= 0 && indice < notas.size()) {
            return notas.get(indice);
        }
        return null;
    }

    // Método para alterar uma nota (por índice)
    public boolean alterarNota(int indice, String novaNota) {
        if (indice >= 0 && indice < notas.size()) {
            notas.set(indice, novaNota);
            return true;
        }
        return false;
    }

    // Método para listar todas as notas
    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota encontrada.");
        } else {
            System.out.println("Notas:");
            for (int i = 0; i < notas.size(); i++) {
                System.out.println((i + 1) + ". " + notas.get(i));
            }
        }
    }
}

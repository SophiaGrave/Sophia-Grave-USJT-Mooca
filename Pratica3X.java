import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class Pratica3X 
{
    public static void main(String[] args) 
    {
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int totalVotos = 0;

        while (true) 
        {
            // Fala para o aluno votar, digitando o número do candidato (1 a 4)
            String votoTexto = JOptionPane.showInputDialog("Digite o número do candidato (1, 2, 3, 4) ou -1 para encerrar:");
            int voto = Integer.parseInt(votoTexto);

            // Vê se o voto é -1, para encerrar a votação
            if (voto == -1) {
                break;
            }

            // Vê se o voto é válido
            if (voto >= 1 && voto <= 4) 
            {
                // Incrementa o voto do candidato correspondente
                totalVotos++;
                switch (voto) {
                    case 1:
                        votosCandidato1++;
                        break;
                    case 2:
                        votosCandidato2++;
                        break;
                    case 3:
                        votosCandidato3++;
                        break;
                    case 4:
                        votosCandidato4++;
                        break;
                }
                
            } else {
            
                // Informa ao aluno que o voto é inválido
                JOptionPane.showMessageDialog(null, "Voto inválido. Por favor, vote em um candidato de 1 a 4.");
            }
        }

        // Calcula o percentual de votos de cada candidato
        DecimalFormat df = new DecimalFormat("0.00");
        double percentual1 = (totalVotos > 0) ? (votosCandidato1 * 100.0 / totalVotos) : 0;
        double percentual2 = (totalVotos > 0) ? (votosCandidato2 * 100.0 / totalVotos) : 0;
        double percentual3 = (totalVotos > 0) ? (votosCandidato3 * 100.0 / totalVotos) : 0;
        double percentual4 = (totalVotos > 0) ? (votosCandidato4 * 100.0 / totalVotos) : 0;

        // Resultado da eleição
        String resultado = "Resultado da eleição:\n" +
                "Candidato 1: " + df.format(percentual1) + "%\n" +
                "Candidato 2: " + df.format(percentual2) + "%\n" +
                "Candidato 3: " + df.format(percentual3) + "%\n" +
                "Candidato 4: " + df.format(percentual4) + "%\n" +
                "Total de eleitores: " + totalVotos;

        JOptionPane.showMessageDialog(null, resultado);
    }
}

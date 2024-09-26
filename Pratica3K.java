 import javax.swing.JOptionPane;
public class Pratica3K
{
    public static void main(String[] args) 
    {
        // Totalde consumo por tipo 
        double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
        int contResidencial = 0, contComercial = 0;  

        while (true) 
        {
            // Codigo do consumidor 
            String inputCodigo = JOptionPane.showInputDialog("Digite o código do consumidor (ou 0 para encerrar):");
            int codigo = Integer.parseInt(inputCodigo);

            // Verifica se o código e 0 para encerrar o loop
            if (codigo == 0) {
                break;  // Encerra o programa
            }

            // Quantidade de kWh consumidos
            String inputConsumo = JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos:");
            double consumo = Double.parseDouble(inputConsumo);

            // Tipo de consumidor
            String inputTipo = JOptionPane.showInputDialog("Digite o tipo de consumidor (1-Residencial, 2-Comercial, 3-Industrial):");
            int tipo = Integer.parseInt(inputTipo);

            double custo = 0; 

            // Verifica o tipo de consumidor e calcula o custo
            if (tipo == 1) {
                custo = consumo * 0.3;
                totalResidencial += consumo;
                contResidencial++;
            } else if (tipo == 2) {
                custo = consumo * 0.5;
                totalComercial += consumo;
                contComercial++;
            } else if (tipo == 3) {
                custo = consumo * 0.7;
                totalIndustrial += consumo;
            } else {
                JOptionPane.showMessageDialog(null, "Tipo inválido! Digite 1, 2 ou 3.");
                continue;
            }

            // Mostra o custo total para o consumidor
            JOptionPane.showMessageDialog(null, "Código do consumidor: " + codigo + "\nCusto total: R$ " + String.format("%.2f", custo));
        }

        // Mostra os totais de consumo por tipo de consumidor
        JOptionPane.showMessageDialog(null, "Total de consumo residencial: " + totalResidencial + " kWh\n" +
                                            "Total de consumo comercial: " + totalComercial + " kWh\n" +
                                            "Total de consumo industrial: " + totalIndustrial + " kWh");

        // Calcula e exibir a media de consumo dos tipos 1 e 2
        double mediaResidencial = (contResidencial > 0) ? totalResidencial / contResidencial : 0;
        double mediaComercial = (contComercial > 0) ? totalComercial / contComercial : 0;
        
        JOptionPane.showMessageDialog(null, "Média de consumo Residencial: " + mediaResidencial + " kWh\n" +
                                            "Média de consumo Comercial: " + mediaComercial + " kWh");
    }
}

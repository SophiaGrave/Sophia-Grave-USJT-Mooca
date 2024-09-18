public class CalculoDeDividaSolucao1E
{
    public static void main (String [] sorvete)
    {
    
        // Defina os valores
        double valorInicial = 100.00; // Valor inicial da dívida
        double taxaJuros = 10.0;      // Taxa de juros 
        int numeroMeses = 8;          // Número de meses

        // Calcule o valor final usando a fórmula dos juros 
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros / 100, numeroMeses);

        // Exiba o resultado
        System.out.printf("O valor final da dívida após " + numeroMeses + " meses é: R$ " + String.format("%.2f", valorFinal));;
    }
    
}
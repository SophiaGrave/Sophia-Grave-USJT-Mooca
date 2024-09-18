public class NumeroInteiroAoQuadradoSolucao1C
{
    public static void main(String[] args) 
    {
        // Defina o número inteiro aqui
        int numeroInteiro = 9; // Substitua por qualquer valor inteiro desejado
        
        // Converta o número inteiro para double para usar no Math.pow
        double base = (double) numeroInteiro;
        double expoente = 3.0; // Elevando ao quadrado
        
        // Calcule o quadrado do número usando Math.pow
        double resultado = Math.pow(base, expoente);
        
        // Exiba o resultado
        System.out.println("O número " + numeroInteiro + " elevado ao quadrado é: " + resultado);
    }
}

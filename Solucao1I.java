public class CalcularNumeroLogaritmoSolucao1I
{
    public static void main(String[] gato) 
    {
        // Um numero e uma base  
        double numero = 600; // Número para o qual calcular o logaritmo
        double base = 60;    // Base do logaritmo

        // Calcule o logaritmo na base especificada
        double logaritmo = Math.log(numero) / Math.log(base);

        // Exiba o resultado
        System.out.println("Logaritmo de " + numero + " na base " + base + " é: " + logaritmo);
    }
}

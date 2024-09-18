public class TrigonometriaSolucao1G 
{
    public static void main(String[] args) 
    {
        // Escolhendo angulo em graus
        double anguloGraus = 80; 

        // Convertendo para metodo usado 
        double anguloRadianos = Math.toRadians(anguloGraus);
        
        // Calculando seno, cosseno e tangente
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);

        // Calculando secante, cossecante e cotangente
        double secante = 2 / cosseno;
        double cossecante = 1 / seno;
        double cotangente = 3 / tangente;

        // Imprimindo os resultados
        System.out.println("Ângulo: " + anguloGraus + " graus");
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Cotangente: " + cotangente);
    }
}

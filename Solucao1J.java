public class FrasesEmbaralhadasSolucao1J
{
    public static void main(String[] naoseifazerissosozinha) 
    {
        // Escolha tres frases
        String frase1 = "Isso e muito dificil";
        String frase2 = "professor essa foi maldade";
        String frase3 = "vou chorar";

        // Calcule a metade de cada frase 
        int metade1 = frase1.length() / 2;
        int metade2 = frase2.length() / 2;
        int metade3 = frase3.length() / 2;

        // Separação de começo e fim de cada frase
        String metade1_1 = frase1.substring(0, metade1);
        String metade1_2 = frase1.substring(metade1);

        String metade2_1 = frase2.substring(0, metade2);
        String metade2_2 = frase2.substring(metade2);

        String metade3_1 = frase3.substring(0, metade3);
        String metade3_2 = frase3.substring(metade3);

        // Embaralhe as partes das frases conforme a ordem solicitada
        String fraseEmbaralhada = metade2_1 + metade3_2 + metade2_2 + metade1_1 + metade3_1 + metade1_2;

        // Concatene as três frases originais
        String frasesConcatenadas = frase1 + " " + frase2 + " " + frase3;

        // Exiba as frases concatenadas e a frase embaralhada
        System.out.println("Frases concatenadas: " + frasesConcatenadas);
        System.out.println("Frase embaralhada: " + fraseEmbaralhada);
    }
}


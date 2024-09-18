public class DDMMAASolucao1K 
{
    public static void main(String[] args) 
    {
        // Data do jeito ddmmaa
        int data = 16092024;

        // Separe o dia, mês e ano
        int dia = data / 1000000; // Utiliza os dois primeiros digitos (dia)
        int mes = (data / 10000) % 100; // Utiliza os dois dígitos do meio (mês)
        int ano = data % 10000; // utiliza os dois últimos dígitos (ano)

        // O resultado
        System.out.println("Dia: " + dia);
        System.out.println("Mes: " + mes);
        System.out.println("Ano: " + ano);
    }
}

public class DDMMAAComSplitSolucao1L
{
    public static void main(String[] args) 
    {
        // Data no formato dd/mm/aa
        String data = "16/09/24";

        // Achar o separador método split()
        String[] partes = data.split("/");

        // Extraia o dia, mês e ano das partes
        String dia = partes[0]; // Partes antes do "/"
        String mes = partes[1]; // Partes do meio dos "/" 
        String ano = partes[2]; // Partes depois do ultimo "/" 

        // Exiba o resultado
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
}

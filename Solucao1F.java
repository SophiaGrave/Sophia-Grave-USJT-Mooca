public class CasaDecimaisECasaDezenasSolucao1F
{ 
   public static void main (String[] pamonha)
   {
      //Defina um numero inteiro com tres casas decimais
      int numero = 389; 
      
      //Imprima o algarismo da casa das dezenas 
      int algarismoDasDezenas = (numero/10) %10;
      
      //Exiba o algarismo da casa das dezenas 
      System.out.println("O algarismo da casa das dezenas é: " + algarismoDasDezenas);
    }
  
}
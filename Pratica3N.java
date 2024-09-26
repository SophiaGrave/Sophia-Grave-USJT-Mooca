import javax.swing.JOptionPane;
public class Pratica3N
{
    public static void main(String[] args) 
    {
        int numero;
        int maior = Integer.MIN_VALUE;

        while (true) 
        {
            String snumeros = JOptionPane.showInputDialog("Digite um numero (-9999 para sair)");
            numero = Integer.parseInt(snumeros);

            if (numero == -9999) 
            {
            //para a entrada se -9999 for digitado
                break; 
            }
            // Verificando o maior numero
            if (numero > maior) 
            {
                maior = numero;
            }
        }
        //verificando se algum numero for digitado antes de -9999
        if (maior == Integer.MIN_VALUE)
        {
           JOptionPane.showMessageDialog(null, "Nenhum número válido foi digitado.");
        } else {   
        JOptionPane.showMessageDialog(null, "O maior número digitado é: " + maior);
      }
   }  
}
import javax.swing.JOptionPane;
public class Pratica3O 
{
    public static void main(String[] args) 
    {
        // Numero do usuario
        String input = JOptionPane.showInputDialog("Digite um número:");

        // Converter para um numero inteiro 
        int numero = Integer.parseInt(input);

        // Colocar os primeiros numeros da sequencia 
        int a = 0, b = 1;
        int proximo =0;
        int contador = 1;
        StringBuilder sequencia = new StringBuilder("Sequência de Fibonacci até " + numero + ":\n");

        // Colocar os numeros da sequência ao StringBuilder
        if (numero >= 1); 
        {
            sequencia.append(a).append(" "); 
          
          {
           // Calcular e adicionar a sequência
            while (contador < numero) 
            {
                contador++;
                //sequencia.append(b).append(" ");
                proximo = a + b; 
                a = b; 
                b = proximo;           
               }     
         }       

         
                 }
                  // Resultado 
          JOptionPane.showMessageDialog(null, ""+ proximo);

     } 
}


        

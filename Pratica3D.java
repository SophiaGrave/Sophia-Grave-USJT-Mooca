import javax.swing.JOptionPane;
public class Pratica3D 
{
    public static void main(String[] args) 
    {
        int contador = 0; 

        while (true) 
        {
            // Fala para o usuario digitar um numero 
            String input = JOptionPane.showInputDialog("Digite um número (ou 0 para encer
            // Verifica se o numero nao encerra o programa 
            if (numero == 0){
             break; // Sai do loop se o número for 0
            }
            
            //Verifica se o numero esta entre 100 e 200
            if (numero >= 100 && numero <= 200)
            {
                contador++; 
            }
        }

        // Mostra quantos numeros entre 100 e 200 foram digitados
        JOptionPane.showMessageDialog(null, "Números entre 100 e 200: " + contador);
    }
}

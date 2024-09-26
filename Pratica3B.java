import javax.swing.JOptionPane;
public class Pratica3B 
{
    public static void main(String[] args) 
    {
        // String vazia para os numeros pares 
        String pares = "";

        // Os 100 primeiros numeros pares 
        for (int i = 1; i <= 100; i++) {
            int par = i * 2; 
            pares += par + "\n"; 
        }

        // Imprimir os 100 numeros pares em uma unica caixa string 
        JOptionPane.showMessageDialog(null, pares, "100 Primeiros Números Pares", JOptionPane.INFORMATION_MESSAGE);
    }
}
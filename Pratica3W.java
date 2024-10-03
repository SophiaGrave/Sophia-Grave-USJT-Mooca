import javax.swing.JOptionPane;
public class Pratica3W 
{
    public static void main(String[] args)
    {
        double total = 0.0;

        while (true) 
        {
            // Fala para o usuário digitar o preço da mercadoria
            double preco;
            do {
                String precoTexto = JOptionPane.showInputDialog("Digite o preço da mercadoria (valor positivo):");
                preco = Double.parseDouble(precoTexto);
                if (preco < 0) {
                    JOptionPane.showMessageDialog(null, "Preço inválido. Digite um valor positivo.");
                }
            } while (preco < 0);

            // Fala para o usuário digitar a quantidade de itens comprados
            int quantidade;
            do {
                String quantidadeTexto = JOptionPane.showInputDialog("Digite a quantidade comprada (ou 0 para finalizar):");
                quantidade = Integer.parseInt(quantidadeTexto);
                if (quantidade < 0) {
                    JOptionPane.showMessageDialog(null, "Quantidade inválida. Digite um valor positivo ou zero para finalizar.");
                }
            } while (quantidade < 0);

            // Vê se o usuário digitou 0 para a quantidade, finalizando a entrada de dados
            if (quantidade == 0) {
                break;
            }

            // Calcula o valor total a ser pago e acumula no total
            total += preco * quantidade;
        }

        // Mostra o total a ser pago
        JOptionPane.showMessageDialog(null, "Total a ser pago: R$ " + total);
    }
}

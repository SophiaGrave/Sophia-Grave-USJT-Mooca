import javax.swing.JOptionPane;
public class ProdutoTeste
{
    public static void main(String[] args) 
    {
        // Pedindo o nome do produto
        String nome = JOptionPane.showInputDialog("Digite o nome do Produto:");
        
        // Pedindo o preço do produto (convertendo para double)
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do Produto:"));
        
        // Pedindo a quantidade do produto (convertendo para inteiro)
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do Produto:"));

        // Criando um objeto da classe Produto com os dados fornecidos
        Produto produto = new Produto(nome, preco, quantidade);

        // Mostrando os dados do produto criado
        JOptionPane.showMessageDialog(null, 
            "Produto Criado:\n" +
            "Nome: " + produto.getNome() + "\n" +
            "Preço: R$ " + produto.getPreco() + "\n" +
            "Quantidade: " + produto.getQuantidade());
    }
}

/*Crie uma classe chamada Fatura para que uma loja de suprimentos em informática possa apresentar a fatura de um produto vendido na loja. Essa classe deverá ter uma variável de instância denominada totalFatura. Na referida classe deverá ter um método que recebe estas informações:
- Número da fatura (String)
- Nome do produto (String)
- Quantidade de produtos (int)
- Preço de cada produto (double)
Então, calcule o total da fatura (preço x quantidade) e guarde na variável de instância criada anteriormente. Nessa mesma classe, crie um segundo método que mostra uma tela com todos os
itens da fatura, inclusive o total da mesma. */

import javax.swing.JOptionPane;
public class fatura {
    // Variáveis de instância
    String numeroFatura;
    String nomeProduto;
    int quantidade;
    double precoCadaProduto;
    double totalFatura;

    // Método para calcular e armazenar o total da fatura
    void calcularTotalFatura(String numero, String nome, int qtd, double preco) {
        numeroFatura = numero;
        nomeProduto = nome;
        quantidade = qtd;
        precoCadaProduto = preco;
        totalFatura = quantidade * precoCadaProduto;
    }

    // Método para exibir os detalhes da fatura
    void exibirFatura() {
        JOptionPane.showMessageDialog(null,
            "Número da Fatura: " + numeroFatura + "\n" +
            "Produto: " + nomeProduto + "\n" +
            "Quantidade: " + quantidade + "\n" +
            "Preço por Produto: R$ " + precoCadaProduto + "\n" +
            "Total da Fatura: R$ " + totalFatura
        );
    }
}

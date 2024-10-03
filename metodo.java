import javax.swing.JOptionPane;

public class metodo {
    public static void main(String[] args) {
        // Cria uma instância da classe Fatura
        fatura fatura = new fatura();

        // Captura os dados de entrada do usuário
        String numero = JOptionPane.showInputDialog("Digite o número da fatura:");
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos:"));
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de cada produto:"));

        // Calcula e exibe a fatura
        fatura.calcularTotalFatura(numero, nome, quantidade, preco);
        fatura.exibirFatura();
    }
}

package entidades;

public class Roupa {
    public String marca;
    public String tipo;
    public String tamanho;
    public int quantidade;
    public double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void adicionaEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Valor Inválido");
        }
    }

    public void removeEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade indisponível ou Valor Inválido");
        }
    }
    public double valorTotal() {
        return this.quantidade * this.valor;
    }

    @Override
    public String toString() {
        return "Roupa" +
                "\nmarca: " + marca +
                "\ntipo: " + tipo +
                "\ntamanho: " + tamanho +
                "\nquantidade: " + quantidade +
                "\nvalor: R$" + valor +
                "\nvalorTotal: R$" + valorTotal();
    }

}

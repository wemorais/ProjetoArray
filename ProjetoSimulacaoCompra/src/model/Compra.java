package model;

public class Compra implements Comparable<Compra> {
    private String produto;
    private double valor;

    public Compra(String produto, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException(" ⚠️ ATENÇÃO: O valor da compra deve ser positivo!");
        }
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%s - R$ %.2f", produto, valor);
    }

    @Override
    public int compareTo(Compra outra) {
        return Double.compare(this.valor, outra.valor);
    }
}




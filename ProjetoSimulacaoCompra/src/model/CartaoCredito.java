package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoCredito {
    private Cliente cliente;
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double limite, Cliente cliente) {
        if (limite <= 0) {
            throw new IllegalArgumentException("O limite do cartão deve ser positivo!");
        }
        this.limite = limite;
        this.saldo = limite;
        this.cliente = cliente;
        this.compras = new ArrayList<>();
    }

    public boolean realizarCompra(Compra compra) {
        if (saldo >= compra.getValor()) {
            saldo -= compra.getValor();
            compras.add(compra);
            return true;
        }
        return false;
    }

    public void listarCompras() {
        System.out.println("====================================");
        System.out.println("COMPRAS REALIZADAS:\n");

        if (compras.isEmpty()) {
            System.out.println("Nenhuma compra foi realizada.");
        } else {
            Collections.sort(compras);
            compras.forEach(System.out::println);
        }

        System.out.println("\n====================================");
        System.out.printf("Saldo restante do cartão: R$ %.2f%n", saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Compra> getCompras() {
        return Collections.unmodifiableList(compras); //coleção para não alterar externamente
    }
}

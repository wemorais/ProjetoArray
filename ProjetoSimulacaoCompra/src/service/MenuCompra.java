package service;

import model.CartaoCredito;
import model.Compra;

import java.util.Scanner;

public class MenuCompra {
    private final Scanner scanner = new Scanner(System.in);
    private final CartaoCredito cartao;

    public MenuCompra(CartaoCredito cartao) {
        this.cartao = cartao;
    }

    public void iniciar() {
        int opcao;
        do {
            System.out.print("\nDigite o produto que deseja comprar: ");
            String produto = scanner.next();

            System.out.print("Informe o valor total do produto: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(produto, valor);

            if (cartao.realizarCompra(compra)) {
                System.out.println("✅ Compra realizada com sucesso!");
            } else {
                System.out.println("❌ Saldo insuficiente!");
            }

            System.out.print("\nDigite 0 para sair ou 1 para continuar: ");
            opcao = scanner.nextInt();

        } while (opcao != 0);

        cartao.listarCompras();
    }
}


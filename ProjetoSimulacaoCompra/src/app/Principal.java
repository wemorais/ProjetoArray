package app;

import model.CartaoCredito;
import model.Cliente;
import service.MenuCompra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== MENU DE COMPRAS ======\n");
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o limite do seu cartão: ");
        double limite = scanner.nextDouble();

        Cliente cliente = new Cliente(nome);
        CartaoCredito cartao = new CartaoCredito(limite, cliente);

        System.out.printf("\nBem-vindo(a) %s! Seu saldo inicial é de R$ %.2f%n",
                cliente.getNome(), cartao.getSaldo());

        MenuCompra menu = new MenuCompra(cartao);
        menu.iniciar();

        scanner.close();
    }
}


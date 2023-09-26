package com.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Produtos produtos = new Produtos();
        Funcionarios funcionarios = new Funcionarios();
        Receita receita = new Receita();
        Pedidos pedidos = new Pedidos();

        int choice = 0;
        while (choice != 7) {
            System.out.println("\nMenu:");
            System.out.println("1. Imprimir clientes do banco de dados.");
            System.out.println("2. Imprimir produtos do arquivo CSV.");
            System.out.println("3. Imprimir dados dos funcionários cadastrados.");
            System.out.println("4. Calcular receita anual.");
            System.out.println("5. Inserir pedido.");
            System.out.println("6. Imprimir lista de pedidos");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cliente.imprimirClientes();
                    break;
                case 2:
                    produtos.importarEImprimirProdutos();
                    break;
                case 3:
                    funcionarios.imprimirFuncionarios();
                    break;
                case 4:
                    receita.calcularReceitaAnual();
                    break;
                case 5:
                    scanner.nextLine(); 
                    System.out.print("Nome do produto: ");
                    String produto = scanner.nextLine();
                    System.out.print("Preço: $");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    pedidos.adicionarPedido(produto, preco, quantidade);
                    System.out.print("Pedido feito com sucesso...");
                    break;
                case 6:
                    pedidos.imprimirPedidos();
                    break; 
                case 7:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                
            }
              
        }

       
        scanner.close();
    }
}

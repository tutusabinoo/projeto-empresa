package com.example;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private List<String> produtos = new ArrayList<>();
    private List<Double> precos = new ArrayList<>();
    private List<Integer> quantidades = new ArrayList<>();

    public void adicionarPedido(String produto, double preco, int quantidade) {
        produtos.add(produto);
        precos.add(preco);
        quantidades.add(quantidade);

        
        System.out.println("Pedido feito com sucesso para o produto: " + produto);
    }

    public void imprimirPedidos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum pedido foi feito ainda.");
        } else {
            System.out.println("Lista de Pedidos:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println("Produto: " + produtos.get(i) +
                        ", Preço: $" + precos.get(i) +
                        ", Quantidade: " + quantidades.get(i));
            }
        }
    }
}


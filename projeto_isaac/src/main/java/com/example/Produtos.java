package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Produtos {
    public void importarEImprimirProdutos() {
        String csvFile = "produtos.csv";
        String line;

        System.out.println("Dados dos Produtos:");

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
             String[] produto = line.split(",");
                for (String item : produto) {
                    System.out.println(item);}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

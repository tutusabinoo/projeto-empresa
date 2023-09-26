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
                
                if (!line.trim().isEmpty()) {
                  
                    String[] produto = line.split(",");

                    
                    if (produto.length >= 1) {
                        System.out.println( produto[0].trim());

                        
                        if (produto.length >= 2) {
                            System.out.println( produto[1].trim());
                        }

                        if (produto.length >= 3) {
                            System.out.println( produto[2].trim());
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

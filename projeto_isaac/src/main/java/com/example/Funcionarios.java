package com.example;

public class Funcionarios {
    public void imprimirFuncionarios() {
        String[] nomes = {"João", "Arthur", "Lucas", "Isaac", "Matue"};
        int[] idades = {30, 35, 28, 40, 32};
        double[] salarios = {3000.0, 3500.0, 2800.0, 4000.0, 3200.0};

        System.out.println("Dados dos Funcionários:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i] +
                    ", Idade: " + idades[i] +
                    ", Salário: $" + salarios[i]);
        }
    }
}

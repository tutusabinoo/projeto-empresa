package com.example;

import java.util.Scanner;

public class Receita {
    public void calcularReceitaAnual() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor ganho em um mês: $");
        double valorMensal = scanner.nextDouble();

        double gastosMensais = 500.0;
        double receitaAnual = (valorMensal - gastosMensais) * 12;

        System.out.println("Receita Anual estimada: $" + receitaAnual);

       
        
    }
}

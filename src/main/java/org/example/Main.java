package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Digite o primeiro valor inteiro:\n");
            Integer value = Integer.parseInt(bf.readLine());
            System.out.print("Digite o segundo valor inteiro:\n");
            Integer value2 = Integer.parseInt(bf.readLine());
            System.out.printf("A média dos dois valores é %d\n", (value + value2) / 2);
        } catch (Exception e) {
            System.out.println("Não foi possível calcular a média dos valores informados.");
            e.printStackTrace();
        }
    }
}
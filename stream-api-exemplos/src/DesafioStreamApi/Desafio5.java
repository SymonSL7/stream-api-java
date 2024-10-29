package DesafioStreamApi;

import java.util.*;


public class Desafio5 {

    // Desafio 5 - Calcule a média dos números maiores que 5:
    // Com a Stream API, calcule a média dos números maiores que 5 e exiba o
    // resultado no console.

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3};
        
        Double media = Arrays.stream(numeros)
                .filter(n -> n > 5) // Filtra números maiores que 5
                .average() // Calcula a média
                .orElse(0.0); // Retorna 0.0 se não houver números

        System.out.println("A média dos números maiores que 5 é: " + media);

    }

}

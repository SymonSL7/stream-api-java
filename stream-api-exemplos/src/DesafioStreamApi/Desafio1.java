package DesafioStreamApi;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {

    // Desafio 1 - Mostre a lista na ordem numérica:
    // Crie um programa que utilize a Stream API para ordenar a lista de números em
    // ordem crescente e a exiba no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Usando Stream API para ordenar e exibir os números
        numeros.stream()
                .sorted() // Ordena os números em ordem crescente
                .forEach(System.out::println); // Exibe cada número no console

        System.out.println("----------------------------------------------------------------------");        

        // Usando Stream API para ordenar em ordem decrescente
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted((a, b) -> b.compareTo(a)) // Ordenação decrescente
                .toList(); // Coletando o resultado em uma lista                              
                
        // Exibindo a lista ordenada no console
        System.out.println("Números em ordem decrescente: " + numerosOrdenados);

    }

}

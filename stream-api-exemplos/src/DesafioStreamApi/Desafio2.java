package DesafioStreamApi;

import java.util.Arrays;
import java.util.List;


public class Desafio2 {

    // Desafio 2 - Imprima a soma dos números pares da lista:
    // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o
    // resultado no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Usando Stream API para somar os números pares
        int somaPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra os números pares
                .mapToInt(Integer::intValue) // Converte para int
                .sum(); // Soma os números pares

        // Exibe o resultado no console
        System.out.println("A soma dos números pares é: " + somaPares);

    }

}

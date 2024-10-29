package DesafioStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio4 {

    // Desafio 4 - Remova todos os valores ímpares:
    // Utilize a Stream API para remover os valores ímpares da lista e imprima a
    // lista resultante no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Usando Stream API para remover os valores ímpares
        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra os números pares
                .collect(Collectors.toList()); // Coleta os resultados em uma nova lista

        // Exibe a lista resultante no console
        System.out.println("Lista de números pares: " + numerosPares);

    }

}

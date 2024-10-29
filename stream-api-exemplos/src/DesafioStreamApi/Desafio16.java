package DesafioStreamApi;

import java.util.*;
import java.util.stream.*;

public class Desafio16 {

    // Desafio 16 - Agrupe os números em pares e ímpares:
    // Utilize a Stream API para agrupar os números em duas listas separadas, uma
    // contendo os números pares e outra contendo os números ímpares da lista
    // original, e exiba os resultados no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> agrupados = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0)); // Agrupa em pares e ímpares

        List<Integer> pares = agrupados.get(true); // Números pares
        List<Integer> impares = agrupados.get(false); // Números ímpares

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

    }

}

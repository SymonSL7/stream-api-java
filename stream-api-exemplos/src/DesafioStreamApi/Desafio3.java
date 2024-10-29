package DesafioStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Desafio3 {

    // Desafio 3 - Verifique se todos os números da lista são positivos:
    // Com a ajuda da Stream API, verifique se todos os números da lista são
    // positivos e exiba o resultado no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Usando Stream API para verificar se todos os números são positivos
        boolean todosPositivos = numeros.stream()
                .allMatch(n -> n > 0); // Verifica se todos são positivos

        // Exibe o resultado no console
        System.out.println("Todos os números são positivos? " + todosPositivos);

    }

}
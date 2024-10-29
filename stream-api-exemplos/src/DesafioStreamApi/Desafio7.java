package DesafioStreamApi;

import java.util.*;

public class Desafio7 {

    // Desafio 7 - Encontrar o segundo número maior da lista:
    // Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o
    // resultado no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Remove duplicatas, se houver
                .sorted((a, b) -> b - a) // Ordena em ordem decrescente
                .skip(1) // Pula o maior número
                .findFirst(); // Pega o próximo número (segundo maior)

        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número é: " + segundoMaior.get());
        } else {
            System.out.println("Não há um segundo maior número na lista.");
        }

    }

}

package DesafioStreamApi;

import java.util.*;

public class Desafio6 {

    // Desafio 6 - Verificar se a lista contém algum número maior que 10:
    // Utilize a Stream API para verificar se a lista contém algum número maior que
    // 10 e exiba o resultado no console.

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean existeMaiorQueDez = numeros.stream()
            .anyMatch(n -> n > 10); // Verifica se existe algum número maior que 10

        if (existeMaiorQueDez) {
            System.out.println("A lista contém pelo menos um número maior que 10.");
        } else {
            System.out.println("A lista não contém números maiores que 10.");
        }
    }

    }



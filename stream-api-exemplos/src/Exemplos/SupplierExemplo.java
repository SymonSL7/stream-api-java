package Exemplos;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExemplo {

    public static void main(String[] args) {
    // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
    //Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

    // Usar o Supplier para obter uma lista com 5 saudações
    List<String> listaSaudacoes = Stream.generate(()-> "Olá, seja bem-vindo(a)!")
        .limit(5)
        .toList();

    // Imprimir as saudações geradas
    listaSaudacoes.forEach(System.out::println);
  }

}

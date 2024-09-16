package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio_1 {

    /* Desafio 1 - Mostre a lista na Ordem númerica:
    *  Crie um programa que utilize a Stream API para ordenar a lista de números
    *  em ordem crescente e a exibir no console./
    */


    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream()
                .sorted()
                .forEach(System.out::println);
    }

}

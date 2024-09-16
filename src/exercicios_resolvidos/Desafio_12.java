package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;

public class Desafio_12 {

    //Desafio 12 - Encontre o produto de todos os números da lista:
    //Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produto = numeros.stream() // .stream() converte a lista em uma stream
                .reduce(1, (a, b) -> a*b); // .reduce() aplica a multiplicação a todos os elementos da lista recebendo
                //o primeiro argumento (1) que é o valor inicial o neutro da ultiplicação
                //(a, b) -> a*b é uma função lambda que multiplica os elementos

        System.out.println("O produto de todos os da lista é: " + produto);
    }
}

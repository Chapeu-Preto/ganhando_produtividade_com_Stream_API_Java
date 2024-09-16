package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;

public class Desafio_11 {

    //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    //Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosQuadrados = numeros.stream()
                .map(n -> n * n) //.map() mapeia cada número para o seu quadrado.
                .reduce(0, Integer::sum); // .reduce(0, Intger::sum) inicia com o valor 0 e vai recebendo a soma de cada número da lista e soma todos os quadrados.

        System.out.println("A soma dos quadrados de todos os números é: " + somaDosQuadrados);

    }
}


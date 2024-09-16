package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

//Desafio 7 - Encontre o segundo número maior da lista:

/*
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */

public class Desafio_7 {

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .sorted((n1, n2) -> n2 - n1)
                .skip(1)
                .findFirst();

        if (segundoMaior.isPresent()) {
            System.out.println("O segundo número maior é: " + segundoMaior);
        } else {
            System.out.println("Não existe um segundo número maior.");
        }

    }
}

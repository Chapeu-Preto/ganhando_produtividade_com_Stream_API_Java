package exercicios_resolvidos;


//Desafio 5 - Calcule a média dos números maiores que 5
/*
* Com a stream API, calcule a média dos números maiores
* que 5 e exiba o resultado no console.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio_5 {

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
                .mapToInt(n -> n)// Converte os elementos para int.
                .filter(n -> n > 5)// Filtra os números maiores que 5.
                .average(); // calcula a média

        if (media.isPresent()) {
            System.out.println("A media da soma dos números maior que 5 é: " + media.getAsDouble());
        } else {
            System.out.println("Não existe números maiores que 5 na lista.");
        }
    }
}

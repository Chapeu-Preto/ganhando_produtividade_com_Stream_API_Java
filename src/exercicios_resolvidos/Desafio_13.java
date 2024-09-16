package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_13 {

    //Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    //Utilize a Stream API para filtrar os números que estão dentro de um intervalo especifico (por exemplo, entre 5 e 10) e exiba o resultado no console.

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        /*tabém podemos limitir definindo o limite d intervalo.

        * int limiteInferior = 5;
        * int limiteSuperior = 10
        *
        * e passar a seguinte condição:

        * List<Integer> intervaloEntre5E10 = numeros.stream()
        *       .filter(n -> n >= limiteInferior && n <= limiteSuperior)
        *       .collect(Collectors.toList());
        */

        List<Integer> intervaloEntre5E10 = numeros.stream()
                .filter(n -> n > 5 && n < 10)
                .collect(Collectors.toList());

        System.out.println("Os números que estão dentro do intervalo entre 5 e 10 é: " + intervaloEntre5E10);
    }
}


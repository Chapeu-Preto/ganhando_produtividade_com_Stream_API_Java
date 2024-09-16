package exercicios_resolvidos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_19 {

    //Desafio 19 - Encontre a soma dos números da lista que são divisíveis por 3 e 5:
    //Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

    public static void main (String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Tendo como base os números acima listados, os unicos números dividiveis por 3 quanto por 5 são: 3, 5, 6, 9, 10, 5 e 3
        //e a soma dos números divisiveis é: 41.

        List<Integer> somaNumerosDivisiveisPor3E5 = Collections.singletonList(numeros.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .reduce(0, Integer::sum));

        System.out.println(somaNumerosDivisiveisPor3E5);
    }
}

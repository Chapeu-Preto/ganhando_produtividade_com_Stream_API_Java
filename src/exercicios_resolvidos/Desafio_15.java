package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;

public class Desafio_15 {

    //Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    //Utilize a Stream API, verifique se a lista contém pelo menos um negativo e exiba o resultado no console.

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroNegativo = numeros.stream()
                .anyMatch(n -> n < 0);

        if (numeroNegativo) {
            System.out.println("A lista contém número(s) negativo.");
        } else {
            System.out.println("A lista não contém números negativos (s)");
        }

    }
}

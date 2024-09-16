package exercicios_resolvidos;

//Desafio 3 - Verifique se todos os números da lista são positivos:

/*
* Com a ajuda da Stream API, verifique se todos os números da lista
* são positivos e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio_3 {

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosOsNumerosPositivos = numeros.stream()
                .allMatch(n -> n > 0);

        if (todosOsNumerosPositivos) {
            System.out.println("Todos os números da lista são positivos.");
        } else {
            System.out.println("Nem todos os números são positivos.");
        }
    }
}

package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Desafio_17 {

    //Desafio 17 - Filtrar os números primos da lista:
    //Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.


    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                        .filter(Desafio_17::numeroPrimo)
                        .collect(Collectors.toList());

        System.out.println("Os números primos são: " + numerosPrimos);
    }

    public static boolean numeroPrimo (int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

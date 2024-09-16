package exercicios_resolvidos;

//Desafio 4 - Remova todos os valores ímpares:

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
 */
public class Desafio_4 {

    public static void main (String [] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                //.sorted() descomentando os números passaram a ser impressos na ordem crescente.
                .collect(Collectors.toList());
        //Em vez de usar o .collect(Collectors.toList()); podemos abreviar utilizando apnes o .toList().

        System.out.println("Números pares: " + numerosPares);
    }

}

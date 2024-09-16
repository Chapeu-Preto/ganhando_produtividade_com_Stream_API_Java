package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_10 {

    //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou 5:
    //Utilize a stream API para agrupar os valores ímpares múltiplos de 3 ou 5 e exiba o resultado no console.

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Para filtrar os números ímpares que são multiplos de 3 ou 5.
        List<Integer> imparesMultiplos3Ou5 = numeros.stream()
                .filter(n -> n % 2 != 0) // .filter() para filtrar os números impres.
                .filter(n -> n % 3 == 0 || n % 5 == 0) // o segundo .filter() para filtrar os números que são multiplos de 3 ou 5.
                .collect(Collectors.toList()); //.collect(Collectors.toList()); passando o  "Collectors.toList()" para coletar o resultado em uma lista.

        System.out.println("Números ímpares múltiplos de 3 ou 5: " + imparesMultiplos3Ou5);

    }
}

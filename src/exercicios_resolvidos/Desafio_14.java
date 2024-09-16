package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio_14 {

    //Desafio 14 - Encontre o maior número primo da lista:
    //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

    public static boolean ePrimo (int numero) {
    //Função para verificar se o número é primo
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .filter(Desafio_14::ePrimo) //o filter() filtra a lista e mantem apenas os números primos.
                .max(Integer::compare); // .max(Integer::compare) encontra o maior número primo.

        maiorNumeroPrimo.ifPresentOrElse(
                prime -> System.out.println("O maior número primo é: " + prime),
                        () -> System.out.println("Não há números primos na lista.")
        );
    }
}

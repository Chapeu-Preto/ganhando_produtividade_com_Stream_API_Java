package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Desafio_8 {

    //Desafio 8 - somar os dígitos de todos os números da lista:
    //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

    public static void main (String [] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> soma = Integer::sum;

        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma dos números é: " + resultado);

    }
}

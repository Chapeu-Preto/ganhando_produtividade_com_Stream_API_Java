package exercicios_resolvidos;

import java.util.Arrays;
import java.util.List;

public class Desafio_9 {

    //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
    //Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

    public static void main (String [] args) {

        List<Integer> numeros = Arrays.asList(1,2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream()// .stream() o stream converte uma lista em uma stream.
                .distinct() // .distinct() retorna uma nova stream sem duplicatas.
                .count() == numeros.size(); // .count() conta o número de elementos na stream após  distinct().
                    //com o tamanho original da lista usando o métodoo .size() assim se não existir números iguais retorna
                    //uma lista com o mesmo tamanho.
        if (todosDistintos) {
            System.out.print("Todos os números são distintos.");
        } else {
            System.out.println("Existem números repetidos na lista");
        }
    }
}

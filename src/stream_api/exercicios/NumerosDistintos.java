package stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

public class NumerosDistintos {
    public static void main(String[] args) {
        //Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream().distinct().count() == numeros.size();

        if(todosDistintos){
            System.out.println("Todos os números são distintos");
        } else {
            List<Integer> resultado = numeros.stream()
                    .distinct() // Remove os duplicados
                    .toList(); // Coleta em uma nova lista
            System.out.println("Lista com números distintos " + resultado);
        }

    }
}

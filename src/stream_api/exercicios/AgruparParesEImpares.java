package stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

public class AgruparParesEImpares {
    public static void main(String[] args) {
        //Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original,
        // e exiba os resultados no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -2);

        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).toList();
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).toList();

        System.out.println("Números pares: " + numerosPares + "\n" + "Números ímpares: " + numerosImpares);
    }
}

package stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

public class SomaDivisiveisPor3ou5 {
    public static void main(String[] args) {
        //Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer resultado = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0).reduce(0, (n1, n2) -> n1 + n2);

        System.out.println("A soma dos números divisiveis por 3 e 5 é: " +  resultado);
    }

}

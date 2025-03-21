package stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

public class OrdemNumerica {
    public static void main(String[] args) {
        //Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

        System.out.println(numerosOrdenados);
    }
}

package stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

public class NumerosPositivos {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        boolean todosPositivos = numeros.stream()
                .anyMatch(n -> n > 0);

        if(todosPositivos){
            List<Integer> resultado = numeros.stream().filter(n -> n >0).toList();
            System.out.println("Esses são os números positivos " + resultado);
        } else{
            System.out.println("Não existem números positivos.");
        }


    }
}

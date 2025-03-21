package stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

public class NumeroNegativo {
    public static void main(String[] args) {
        //Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -2);

        boolean todosNegativos = numeros.stream()
                .anyMatch(n -> n < 0);

        if(todosNegativos){
            List<Integer> resultado = numeros.stream().filter(n -> n < 0).toList();
            System.out.println("Esses são os números negativos " + resultado);
        } else{
            System.out.println("Não existem números negativos.");
        }


    }
}

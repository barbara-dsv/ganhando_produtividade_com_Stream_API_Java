package stream_api.exercicios;

import java.util.Arrays;
import java.util.List;

public class NumerosMaioresQue10 {
    public static void main(String[] args) {
        //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean resultado = numeros.stream().anyMatch(n -> n > 10);

        if(resultado) {
            List<Integer> numerosMaioresQue10 = numeros.stream().filter(n -> n > 10).toList();
            System.out.println("Números maiores que 10: " +numerosMaioresQue10);
        } else{
            System.out.println("Não há números maiores que 10");
        }


    }
}

package stream_api.exercicios;
import java.util.Arrays;
import java.util.List;
public class MediaMaioresQue5 {
    public static void main(String[] args) {
        //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer>  numerosFiltrados = numeros.stream()
                .filter(n -> n >= 5).toList();


        int quantidade = numerosFiltrados.size();

        int soma = numerosFiltrados.stream()
                .mapToInt(n -> n)
                .sum();
        double resultado = (double) soma / quantidade;
        System.out.println(resultado);
    }
}

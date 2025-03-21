package stream_api.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarNumerosPrimos {
    public static void main(String[] args) {
        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando números primos e exibindo no console
        List<Integer> numerosPrimos = numeros.stream()
                .distinct() // Remover duplicados
                .filter(FiltrarNumerosPrimos::ehPrimo) // Filtrar apenas números primos
                .collect(Collectors.toList()); // Coletar em uma lista

        System.out.println("Números Primos: " + numerosPrimos);
    }

    // Método para verificar se um número é primo
    private static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}

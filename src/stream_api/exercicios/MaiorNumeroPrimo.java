package stream_api.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        Optional<Integer> maiorPrimo = numeros.stream()
                .distinct()
                .filter(MaiorNumeroPrimo::ehPrimo)
                .max(Integer::compareTo);

        maiorPrimo.ifPresentOrElse(
                primo -> System.out.println("Maior número primo: " + primo),
                () -> System.out.println("Nenhum número primo encontrado.")
        );
    }

    // Método para verificar se um número é primo
    private static boolean ehPrimo(int n) {
        n = Math.abs(n);

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

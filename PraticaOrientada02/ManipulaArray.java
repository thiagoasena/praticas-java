package PraticaOrientada02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
    public static int[] criarArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho, int valorMaximo) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(valorMaximo + 1);
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        return Arrays.stream(array).sum();
    }

    public static int encontrarMaiorValor(int[] array) {
        return Arrays.stream(array).max().orElseThrow(); // Lança uma exceção se o array for vazio
    }

    public static int encontrarMenorValor(int[] array) {
        return Arrays.stream(array).min().orElseThrow(); // Lança uma exceção se o array for vazio
    }

    public static void main(String[] args) {
        int[] arrayUsuario = criarArrayDoUsuario();
        System.out.println("Array do usuário: " + Arrays.toString(arrayUsuario));

        int tamanhoArrayAleatorio = 5; // Defina o tamanho desejado para o array aleatório
        int valorMaximoAleatorio = 100; // Defina o valor máximo desejado para os elementos do array aleatório
        int[] arrayAleatorio = criarArrayAleatorio(tamanhoArrayAleatorio, valorMaximoAleatorio);
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));

        int soma = calcularSoma(arrayUsuario);
        System.out.println("Soma do array do usuário: " + soma);

        int maiorValor = encontrarMaiorValor(arrayAleatorio);
        System.out.println("Maior valor do array aleatório: " + maiorValor);

        int menorValor = encontrarMenorValor(arrayUsuario);
        System.out.println("Menor valor do array do usuário: " + menorValor);
    }


}


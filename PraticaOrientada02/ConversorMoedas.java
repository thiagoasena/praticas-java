package PraticaOrientada02;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Moeda");
        System.out.print("Digite a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        System.out.print("Digite a taxa de câmbio: ");
        double taxaCambio = scanner.nextDouble();

        if (quantidadeDolares < 0 || taxaCambio < 0) {
            System.out.println("Valores inválidos. Certifique-se de inserir valores positivos.");
        } else {
            double valorConvertido = quantidadeDolares * taxaCambio;
            System.out.println("O valor convertido é: " + valorConvertido);
        }

        scanner.close();
    }
}

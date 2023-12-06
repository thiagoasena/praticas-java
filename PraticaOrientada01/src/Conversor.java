import java.util.Scanner;

public class Conversor
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Escolha a unidade de origem (C para Celsius, F para Fahrenheit): ");
        char unidadeOrigem = scanner.next().charAt(0);

        double resultado = 0;

        if (unidadeOrigem == 'C' || unidadeOrigem == 'c') {
            // Converter de Celsius para Fahrenheit
            resultado = (temperatura * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit é: " + resultado);
        } else if (unidadeOrigem == 'F' || unidadeOrigem == 'f') {
            // Converter de Fahrenheit para Celsius
            resultado = (temperatura - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius é: " + resultado);
        } else {
            System.out.println("Opção inválida. Escolha C ou F.");
        }

        scanner.close();
    }

    
}
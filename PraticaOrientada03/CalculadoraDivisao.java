package PraticaOrientada03;

public class CalculadoraDivisao {

    // Método para adição
    public static int somar(int a, int b) {
        return a + b;
    }

    // Método para subtração
    public static int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicação
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para divisão de inteiros
    public static int dividir(int dividendo, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return dividendo / divisor;
    }

    // Método para divisão de floats
    public static float dividir(float dividendo, float divisor) throws DivisionByZeroException {
        if (divisor == 0.0f) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        try {
            int resultadoDivisaoInt = dividir(10, 2);
            System.out.println("Resultado da divisão (int): " + resultadoDivisaoInt);

            float resultadoDivisaoFloat = dividir(5.0f, 0.0f); // Divisão por zero
            System.out.println("Resultado da divisão (float): " + resultadoDivisaoFloat);

        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String mensagem) {
        super(mensagem);
    }
}

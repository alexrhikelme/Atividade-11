package atividade11;

public class q4 {
    public static void main(String[] args) {
        int x;
        int resultado;

        try {
            x = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: nenhum número foi fornecido como argumento.");
            x = 1;
        } catch (NumberFormatException e) {
            System.out.println("Erro: insira apenas números válidos.");
            x = 1;
        }

        try {
            resultado = divisao(20, x);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException arithmeticException) {
            System.out.printf("Exceção: %s\n", arithmeticException);
        }
    }

    public static int divisao(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }
}
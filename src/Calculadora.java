public class Calculadora {

    public static void soma(double valor1, double valor2) {
        double resultado = valor1 + valor2;

        System.out.println("O resultado da soma entre " + valor1 + " + " + valor2 + " = " + resultado);
    }
    public static void subtracao(double valor1, double valor2) {
        double resultado = valor1 - valor2;

        System.out.println("O resultado da subtracao entre " + valor1 + " - " + valor2 + " = " + resultado);
    }
    public static void multiplicao(double valor1, double valor2) {
        double resultado = valor1 * valor2;

        System.out.println("O resultado da multiplicacao entre " + valor1 + " X " + valor2 + " = " + resultado);
    }
    public static void divisao(double valor1, double valor2) {
        double resultado = valor1 / valor2;

        System.out.println("O resultado da divisao entre " + valor1 + " / " + valor2 + " = " + resultado);
    }

}

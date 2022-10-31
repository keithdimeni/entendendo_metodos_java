public class Main {
    public static void main(String[] args){

        System.out.println("=============== Calculadora ===============");
        Calculadora.soma(2, 4);
        Calculadora.subtracao(6, 3);
        Calculadora.multiplicao(3, 3);
        Calculadora.divisao(9, 3);

        System.out.println("================ Mensagem do Dia ===============");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);

        System.out.println("================ Emprestimo ===============");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 4);

        System.out.println("================ Quadrilatero ===============");
        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(4d, 7d);
        System.out.println("Area do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(3, 5, 7);
        System.out.println("Area do trapezio: " + areaTrapezio);

        float areaLosangulo = Quadrilatero.area(5f, 9f);
        System.out.println("Area do losangulo: " + areaLosangulo);


    }
}
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double numeroUm;
        double numeroDois;
        double multiplicacao;
        double soma;
        int operacaoEscolhida;

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Bem vindo a calculadora, escolha a opção desejada");
        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para multiplicar");

        operacaoEscolhida =  entradaTeclado.nextInt();

        if (operacaoEscolhida == 1){
            System.out.println("Digite o primeiro numero");

            numeroUm =  entradaTeclado.nextDouble();
            System.out.println("Digite o segundo numero");
            numeroDois = entradaTeclado.nextDouble();

            multiplicacao = numeroUm * numeroDois;

            System.out.println("O resuldo da multiplicação de " + numeroUm + " * " + numeroDois + " = " + multiplicacao);

        } else if (operacaoEscolhida == 2) {

            System.out.println("Digite o primeiro numero");
            numeroUm = entradaTeclado.nextDouble();
            System.out.println("Digite o segundo numero");
            numeroDois = entradaTeclado.nextDouble();

            soma = numeroUm + numeroDois;
            System.out.println("O resultado da soma de " + numeroUm + "+" + numeroDois + " = " + soma);
        }


    }
}
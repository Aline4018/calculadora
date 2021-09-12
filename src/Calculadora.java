import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int numeroUm;
        int numeroDois;
        int multiplicacao;

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");

        numeroUm = entradaTeclado.nextInt();
        System.out.println("Digite o segundo numero");
        numeroDois = entradaTeclado.nextInt();

        multiplicacao = numeroUm * numeroDois;

        System.out.println("O resuldo da multiplicação de " + numeroUm + " * " + numeroDois + " = " + multiplicacao);


    }
}

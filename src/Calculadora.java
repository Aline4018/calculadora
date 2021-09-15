import java.util.Scanner;// Importar funções internas da classe

public class Calculadora { // Criando uma classe Pública
    public static void main(String[] args) { // ONde roda o pragrama
        double numeroUm = 0;
        double numeroDois = 0;// Declarando variaveis
        int operacaoEscolhida;
        double resultado;
        boolean rodarCalculadora = true;

        Scanner entradaTeclado = new Scanner(System.in); // Função estaceando um objeto do tipo scanner, para scanear entradas do teclado



        while(rodarCalculadora == true){

            menuInicial(); // Chamando um função

            operacaoEscolhida = entradaTeclado.nextInt();// Primeira Entrada do teclado apos a função menu

            if (operacaoEscolhida == 2) {// Verificação(if) ou comparação.
                System.out.println("Digite o primeiro numero");// Printa a primeira string
                numeroUm = entradaTeclado.nextDouble();// Primeira entrada do teclado apos o print
                System.out.println("Digite o segundo numero"); // Printa a segunda string
                numeroDois = entradaTeclado.nextDouble(); // Primeira entrada do teclado apos o segundo print
                resultado = multiplicar(numeroUm, numeroDois);// Chama a funçao multiplicar passando dois parametros e guarda o retorno da funçao dentro de resultado
                System.out.println("O resultado é: " + resultado);// Printa o resultado da operaçao

            } else if (operacaoEscolhida == 1) { // Verifica e compara se a primera chance não for satisfeita
                System.out.println("Digite o primeiro numero");
                numeroUm = entradaTeclado.nextDouble();
                System.out.println("Digite o segundo numero");
                numeroDois = entradaTeclado.nextDouble();
                resultado = somar(numeroUm, numeroDois);
                System.out.println("O resultado é: " + resultado);

            } else if (operacaoEscolhida == 3) {
                System.out.println("Digite o primeiro numero");
                numeroUm = entradaTeclado.nextDouble();
                System.out.println("Digite o segundo numero");
                numeroDois = entradaTeclado.nextDouble();
                resultado = subtrair(numeroUm , numeroDois);
                System.out.println("O resultado é: " + resultado);

            } else if (operacaoEscolhida == 4) {
                System.out.println("Digite o primeiro numero");
                numeroUm = entradaTeclado.nextDouble();
                System.out.println("Digite o segundo numero");
                numeroDois = entradaTeclado.nextDouble();
                resultado =  dividir( numeroUm, numeroDois);
                System.out.println("O resultado é: " + resultado);

            } else if (operacaoEscolhida == 0){
                System.out.println(" Muito Obrigado por usar a calculadora, nos vemos em problemas futuros!");
                rodarCalculadora = false;
            }
            else { // SE utilizar uma variavel fora das alternativas
                System.out.println(" Sua opção esta invalida, tente novamente um dos numeros de 1 a 4");
            }
        }

    }

    private static double somar(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois; // CRiando função que retona os dois parametros de entrada somados
    }

    private static double subtrair(double numerUm, double numeroDois){
        return numerUm - numeroDois; // subtraidos
    }

    private static double dividir(double numerUm, double numeroDois){
        return numerUm / numeroDois; // Divididos
    }

    private static void menuInicial() { //  Criando uma funçao que printa o menu e não retorna nada
        System.out.println("Bem vindo a calculadora, escolha a opção desejada");
        System.out.println("Digite 1 para somar");
        System.out.println("Digite 2 para multiplicar");
        System.out.println("Digite 3 para subtrair");
        System.out.println("Digite 4 para dividir");
        System.out.println("Digite 0 caso seu calculo ja tenha sido resolvido");

    }

    public static double multiplicar(double numeroUm, double numeroDois){
        double resultado;
        resultado = numeroUm * numeroDois;
        return resultado; //  Forma diferente de tratar os dados
    }
}
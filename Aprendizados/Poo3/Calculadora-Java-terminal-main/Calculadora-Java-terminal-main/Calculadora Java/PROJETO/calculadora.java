1package PROJETO;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();
            
            if(opcao >= 1 && opcao <= 4){
                System.out.println("Insira o primeiro valor:");
                double num1 = scanner.nextDouble();
                System.out.println("Insira o segundo valor:");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true;

                switch (opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = dividir(num1, num2);
                        } else {
                            System.out.println("Não é possível dividir por zero!");
                            operacaoValida = false;
                        }
                        break;
                    default:
                        operacaoValida = false;
                        break;
                }

                System.out.println("O resultado da operação é: " + resultado);

            } else if(opcao != 0){
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Calculadora encerrada!");
            scanner.close();
    }
    public static double adicionar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        return a / b;
    }

}


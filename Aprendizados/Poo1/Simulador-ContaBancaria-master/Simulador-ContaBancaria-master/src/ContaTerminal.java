import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);


        System.out.println("Porfavor Digite Seu nome: ");
        String nomeCliente = Scanner.nextLine();
        

        System.out.println("Digite o numero Da Conta: ");
        int numero = Scanner.nextInt();
        

        System.out.println("Digite a Sua Agencia: ");
        String agencia = Scanner.next();
        Scanner.nextLine();
        

        System.out.println("Seu Saldo e De: ");
        double saldo = Scanner.nextDouble();
        System.out.println();

        Scanner.close();

       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s e o número da sua conta é %d. Seu saldo é %.2f e já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);

    }
}

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner Scanner = new Scanner(System.in);
        String NumeroConta;
        String Agencia;
        String NomeCliente;
        double Saldo;
        System.out.println("Por favor, digite o número da Agência!");
        Agencia = Scanner.nextLine();

        System.out.println("Por favor, digite o Número!");
        NumeroConta = Scanner.nextLine();

        System.out.println("Por favor, digite seu nome e sobrenome.");
        NomeCliente = Scanner.nextLine();

        System.out.println("Por favor, insira seu saldo.");
        Saldo = Scanner.nextDouble();

        
    }

}

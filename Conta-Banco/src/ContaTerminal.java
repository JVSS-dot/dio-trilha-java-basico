import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);
        int NumeroConta;
        String Agencia;
        String NomeCliente;
        double Saldo;
        System.out.println("Por favor, digite o número da Agência!");
        Agencia = Scanner.nextLine();

        System.out.println("Por favor, digite o Número!");
        NumeroConta = Integer.parseInt( Scanner.nextLine());

        System.out.println("Por favor, digite seu nome e sobrenome.");
        NomeCliente = Scanner.nextLine();

        System.out.println("Por favor, insira seu saldo.");
        Saldo = Scanner.nextDouble();

        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s , conta %s e seu saldo %s já está disponível para saque" , NomeCliente , Agencia , NumeroConta , Saldo);

        
    }

}

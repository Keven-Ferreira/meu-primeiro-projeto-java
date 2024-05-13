import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*
         * Este programa tema finalidade de criar uma conta bancária para o desafio da DIO.
         * 
         * Numero int 1021
         * Agencia String 067-8
         * NomeCliente String MARIO ANDADE
         * Saldo Double 237.48
         */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso baco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");

        System.out.print("Por favor, digite o seu nome: ");
        String NomeCliente = scanner.nextLine(); //Nome Completo do Cliente Ex: MARIO ANDRADE

        System.out.print("\nPor favor, digite o número da sua conta: ");
        int Numero = scanner.nextInt(); //Numero da Conta bancária Ex: 1021

        System.out.print("\nPor favor digite a sua agencia: ");
        String Agencia = scanner.next(); //Numeros da Agencia bancária ex: 067-8

        System.out.print("\nQuanto o senhor deseja depositar na sua conta? ");
        Double Saldo = scanner.nextDouble();

        System.out.println("\n\nOlá "+NomeCliente+", obrigado por criar uma conta em nosso baco, sua agência é "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
    }
}

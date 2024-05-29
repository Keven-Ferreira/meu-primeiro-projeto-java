package TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
        public static void main(String[] args) {
            try{
                @SuppressWarnings("resource")
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                System.out.print("Digite o seu nome: ");
                String nome = scanner.next();

                System.out.print("Digite o seu sobrenome: ");
                String sobrenome = scanner.next();

                System.out.print("Digite a sua idade: ");
                int idade = scanner.nextInt();

                System.out.print("Digite sua altura: ");
                double altura = scanner.nextDouble();

                System.out.println("Olá, me chamo "+nome+" "+ sobrenome);
                System.out.println("Tenho "+idade+" anos");
                System.out.println("Minha altura é "+altura+" cm");
            } 
            catch(InputMismatchException e){
                System.out.println("Os campos idade e altura, precisam conter numeros, separados por '.', se for o caso.");
            }
        }
}

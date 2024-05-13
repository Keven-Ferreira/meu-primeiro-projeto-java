package edu.keven.aprendendoasintaxejava.terminalArgumentos;

import java.util.Scanner;
import java.util.Locale;

public class Escanear {
    public static void main(String[] args) {
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
}

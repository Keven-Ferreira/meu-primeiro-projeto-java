/**
 * No Java existem alguns tipos de dados, e palavras reservadas que representam eses tipos de dados.
 * São oito tipos primitivos:
 * Int - Inteiro - Numerico, limitado a -2.147.483.648 / 2147483.647 - ou 4 bytes.
 * byte - Inteiro limitado a -128 / 127 - ou 1 byte
 * shotr - Numerico limitado a -32.768 / 32.7677 - ou 2 bytes
 * long - Numerico limitado a -9223.372.036.854.775.808 / 9223.372.036.854.775.807 - ou 8 bytes. E interessante sempre, ao finadar a declaração da variável ser colocado um "L", minusculo ou maisculo, apenas para o compilador entender que, verdadeiramente, necessitará de um long.
 * float - Numerico, limitado a 4 bytes - -3,4028E + 38 / 3,4028E + 38, no entanto permitindo numeros após a virgula. E interessante sempre, ao findar d declaração da variável ser colocado um "F", minusculo ou maisculo, apenas para o compilador entender que, verdadeiramente, necessitará de um float.
 * double - Numerico - limitado a 8 bytes - -1,7976E + 308 / 1,7976E + 308 digitos.
 * boolean - Tipo booleano, ou seja verdadiro ou falso ou 1 bit
 * char - Tipo de caracter - Permitindo até 20 caracteres 
 * 
 * 
 * 
 * O Java por ser fortemente tipado, faz com que as variáveis sejam extremamente tipadas. Conforme exemplo 1
 */

package edu.keven.aprendendoasintaxejava.tiposevariaveis;

public class javaBasico {
    public static void main(String[] args) {
    
    //Exemplo 1
     short numeroCurto = 1;
     int numeroNormal = numeroCurto;
     short numeroCurto2 = (short) numeroNormal;
     //final exemplo 1
     /*
     *Vimos que o Java da um erro, pois o valor de int, em algum momento, pode ser superior ao do short. Fazendo com que o erro possa se propagar.
     Outra possibilidade é fazer um cast, ou seja definir que eu estou ciente que o valor ali pode dar um erro, e que eu estou ciente disso.
     short numeroCurto2 = (short) numeroNormal;
     */   


     //Variáveis vs Constantes.
     /**
      * Para definir um valor como uma constante existem algumas convenções, deve ser declarada a palavra "final" na declaração, e o nome da constante deve estar em MAIUSCULO.
      * Ex: final double VALOR_DE_PI = 3.14
      *
      */
      //exemplo
      final double VALOR_DE_PI = 3.14;

      System.out.println(VALOR_DE_PI);
    }
}

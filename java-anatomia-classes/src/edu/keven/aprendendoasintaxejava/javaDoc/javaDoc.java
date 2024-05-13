package edu.keven.aprendendoasintaxejava.javaDoc;

public class javaDoc {
         /**
         * <h1>Calculadora</h1>
         * A calculadora realiza operações matemáticas números
         * <p>
         * <b>Note:</b> Leia atentamente a documentaçõ desta classes para desfrutar dos recursos oferecidos pelo autor
         * 
         * @author Gleyson Sampaio
         * @version 1.0
         * @since 01/01/2022
         */
    public class calculadora{
        /**
        * Este método é utilizado para somar dois números inteiros
        * @param numeroUm este é o primeiro parâmetro do método
        * @param numeroDois este é o segundo parâmetro
        * @return int o resultado deste método é a soma dos dois números.
        */

        public int somar(int numeroUm, int numeroDois){
            return numeroUm + numeroDois;
        }      
    }
}

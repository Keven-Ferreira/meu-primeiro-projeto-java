package Operadores;
/**Operadores - Aula 2
 * String nomeCompleto = "LINGUAGEM" + "JAVA";
 * System.out.println(nomeCompleto);
 * String concatenação = "?";
        System.out.println(concatenação);

        concatenação = 1+1+1+"1";
        System.out.println(concatenação);

        concatenação = 1+"1"+1+1;
        System.out.println(concatenação);

        concatenação = "1"+1+1+1;
        System.out.println(concatenação);

        concatenação = "1"+(1+1+1);
        System.out.println(concatenação); 
 * 
 * Operadores - Aula 3
 * int numero = +5;
        System.out.println(- numero ); //O numero vai aparecer negativo, mas o seu valor não se tornará negativo, apenas uma mudança momentanea.

        //Para alterar o numero para negativo, deve-se declarar uma variável de negação.
        numero = - numero;
        System.out.println(numero);
        //Agora sim o numero irá aparecer negativo.
        //Para voltar a torna-lo positivo, deve-se multiplicar o valor por -1, pois o sinal "+" na variável irá apenas apontar um calculo aritimético.
        numero = + numero; // A variável numero permanecerá negativa.
        numero = numero * -1; //agora a variável numero irá voltar a ser positiva.
        System.out.println(numero);

 * Operadores - Aula 4
 * //x  Repetição
        int numero = 5;
        //numero++;
        //Para a incrementação ++ ou -- há algumas formas de ser implementada.
        //numero++ || numero-- - Irá primeiro exibir o valor e depois o incrementar.
        //++numero || --numero - Irá primeiro incrementar o valor para depois o exibir.
        System.out.println(numero++);
        System.out.println(numero);

        //Valores de negação - Para se usar principalmente com valores booleanos.
        boolean variavel = true;
        System.out.println(!variavel);
        //Para se modificar permanentemente a nível de variável o valor, deve-se alterar com uma declaração.
        variavel = !variavel;
 *  
 * Operadores - Aula 5
 *  //Operadores ternários.
        int a,b;
        //String resultado;
        a = 5;
        b = 6;

        //Exemplo de condição utilizando uma estrutura IF/ELSE.
        if(a==b){
            String resultado = "verdadeiro";
        } else {
            String resultado = "falso";
        }

        //Mesma condição mas utilizando o operador ternário.
        String resultado = (a==b) ? "Verdadeiro" : "Falso";
 * 
 * Operadores - aula 06
 * //Operadores Relacionais.

        int numero1 = 1, numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente ao numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        //Na linguagem JAVA também é possivel comparar objetos.
        String nomeUm1 = "Keven";
        String nomeDois2 = "Keven";

        System.out.println(nomeUm1 == nomeDois2); // True - pois os objetos são iguais.

        // Noe netanto objetos são armazenados de formas diferentes na memória, faendo com que a comparação possa dar erro.
        //Para resolver isso, utilizamos o método equals. que faz a comparação dos conteúdos dos objetos.

        String nomeUm = "Keven";
        String nomeDois = new String("Keven");

        System.out.println(nomeUm == nomeDois); // false - pois os objetos são diferentes.
 
        System.out.println(nomeUm.equals(nomeDois)); //true - pois os conteúdos são iguais.
 * 
 * 
*/

public class operadores {

    public static void main(String[] args) {
        //Operadores lógicos
        //&& - e
        // || ou

        boolean  condicao1 = false;
        boolean condicao2 = false;

        if (condicao1 && condicao2 ) {
            System.out.println("As duas condições são verdadeiras.");
        } else if (condicao1 || condicao2) {
            System.out.println("Uma das duas condições é verdadeira.");
        }
        System.out.println("Fim");

    }
}

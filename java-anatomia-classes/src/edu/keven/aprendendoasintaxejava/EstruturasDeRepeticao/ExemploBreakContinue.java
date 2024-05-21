package EstruturasDeRepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for( int numero = 1; numero<=5; numero++){
            if (numero == 3)
                //break; -> Para a execução do programa atual
                continue;//Interrompe a interação atual. No exemplo, não vai imprimir o numero 3.
            
            System.out.println(numero);
        }
    }
}

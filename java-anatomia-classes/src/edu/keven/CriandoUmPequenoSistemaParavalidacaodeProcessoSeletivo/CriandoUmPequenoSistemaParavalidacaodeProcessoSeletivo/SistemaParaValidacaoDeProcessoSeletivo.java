package CriandoUmPequenoSistemaParavalidacaodeProcessoSeletivo;

/**
 * SistemaParaValidacaoDeProcessoSeletivo
 */

import java.util.Scanner;
public class SistemaParaValidacaoDeProcessoSeletivo {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String[][] candidato = new String[3][2];

        for(int i = 0; i <= 2; i++ ){
            System.out.println("Nome do candidato: ");
            candidato[i][0] = scanner.nextLine();

            System.out.println("Informe o salário pretendido: ");
            candidato[i][1] = scanner.nextLine();

            if(i == 2){
                for(int x = 0; x<=2 ; x++){
                    analisarCandidato(candidato[x][1]);
                }
            }
        }

        
    }

    static void analisarCandidato(String salarioPretendido){
        Double salario = Double.parseDouble(salarioPretendido);
        double salarioBase = 2000.0;
        if(salarioBase > salario){
            System.out.println("LIGAR PARA O CANDIDATO;");
        } else if(salarioBase == salario){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }


}
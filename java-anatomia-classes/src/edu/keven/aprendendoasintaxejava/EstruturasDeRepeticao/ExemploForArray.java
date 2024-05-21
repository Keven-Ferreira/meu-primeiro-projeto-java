package EstruturasDeRepeticao;

public class ExemploForArray {

    public static void main(String[] args) {
        //Em arrays, o indice de elementos começa no 0 (Zero).
        String alunos[] = {"Felipe", "Jonas","Julia", "Marcos"};

        /**for(int x =0; x < alunos.length; x++){
            System.out.println("Oluno no indice x = "+x+" é "+alunos[x]);
       }*/
       for(String aluno : alunos){
        System.out.println("O nome do aluno é: "+aluno);
       }

    }
}
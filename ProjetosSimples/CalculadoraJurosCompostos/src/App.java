import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Fazer uma calculadora de juros que atualiza os aportes investidos a 
         * cada ano de acordo com uma inflação previamente definida.
         */
        Scanner scanner = new Scanner(System.in);
         double aporte;
        //Pegar o valor de aporte mensal
        System.out.print("Digite o valor do aporte mensal: R$ ");
        aporte = scanner.nextDouble();

        //Solicitar por quanto tempo se deseja investir!
        System.out.print("Agora digite por quantos anos deseja investir o valor de "+aporte+" : ");
        int tempo = scanner.nextInt();

        //Digitar a taxa de juros de retorno.
        System.out.println("Quanto sera a taxa de juros anual do seu investimento? ");
        double juros = scanner.nextDouble();

        //Verificar a taxa de juros média.
        System.out.println("Qual a taxa média da inflação que deseja aplicar nos aportes? ");
        double inflacao = scanner.nextDouble();

        double valorTotal = 0;
        double valorInvestido = 0;
        for(int x = 1; x <= tempo; x++){
            for (int y = 1; y <= 12; y++){
                valorTotal = valorTotal + ((aporte * (juros/100)/12) + aporte);
                if(x ==1 && y ==1) {
                valorTotal = aporte;}
                System.out.printf("Valor do mês "+y+" do ao "+x+" - R$ "+valorTotal%2.f+"\n");
                valorInvestido = valorInvestido + aporte;
            }
            System.out.printf("valor do ano "+x+" - R$ "+valorTotal%2.f+"\n");
            //aporte = aporte + (aporte * (inflacao/100));
        }

    }
}

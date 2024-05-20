package anatomiadeclasses;

public class MinhaClasse {
    public static void main(String[] args) {
         System.out.print("Olá turma, sejam bem vindos!\n");
         String primeiroNome = "Keven", segundoNome = "Camêlo";
         String meuNome = nomeCompleto(primeiroNome, segundoNome);
         
         String anoFabricacao = "1997";
         System.out.print(meuNome.concat(" nasceu no ano de ").concat(anoFabricacao));
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}

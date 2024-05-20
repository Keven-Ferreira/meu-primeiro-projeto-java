package metodos;

public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    //Ligar e desligar a TV.
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }




    //Aumentar o volume
    public void aumentarVolume(){
        volume++;
        //volume = volume + 1;
    }

    public void diminuirVolume(){
        volume--;
        //volume = volume - 1;
    }




    //Mudar canal
    public void aumentarCanal(){
        canal++;
        //Aumenta canal de 1 em 1.
    }

    public void diminuirCanal(){
        canal--;
        //Reduz o canal de 1 em 1
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        //Deixa o usuário escolher qual o canal quer assistir.
    }

}

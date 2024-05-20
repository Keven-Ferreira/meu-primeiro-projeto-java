package metodos;

public class metodo {
    //Sistema Smart TV
    //O arquivo smartTv.java faz parte desse pacote.
    public static void main(String[] args) {
        smartTv samsung = new smartTv();

        samsung.diminuirVolume();
        samsung.diminuirVolume();
        samsung.diminuirVolume();
        samsung.diminuirVolume();
        samsung.aumentarVolume();

        System.out.println("TV Ligada? " + samsung.ligada);
        System.out.println("Canal Atual: " + samsung.canal);
        System.out.println("Volume Atual: " + samsung.volume);

        samsung.ligar();
        System.out.println("Novo status -> Tv ligada? " + samsung.ligada);

        samsung.desligar();
        System.out.println("Novo status -> Tv ligada? " + samsung.ligada);

    }
}

package edu.keven.aprendendoasintaxejava.anatomiadeclasses;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if(mediaFinal<6)
            System.out.println("REPROVADO");
        else if(mediaFinal==6)
            System.out.println("POVA MINERVA");
        else if (mediaFinal > 6)          
            System.out.println("AROVADO");
    }
}

package it.epicode.be;

import java.util.Scanner;

public class Es2 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserisci il tuo nome:");
        String stringa1 = input.nextLine();
        
        System.out.println("Inserisci il tuo cognome:");
        String stringa2 = input.nextLine();
        
        System.out.println("Inserisci il tuo indirizzo:");
        String stringa3 = input.nextLine();
        
        String concatenazioneOrdineInserimento = stringa1 + stringa2 + stringa3;
        String concatenazioneOrdineInserimentoInverso = stringa3 + stringa2 + stringa1;
        
        System.out.println("Concatenazione (ordine di inserimento): " + concatenazioneOrdineInserimento);
        System.out.println("Concatenazione (ordine di inserimento inverso): " + concatenazioneOrdineInserimentoInverso);
        
        input.close();
    }

}

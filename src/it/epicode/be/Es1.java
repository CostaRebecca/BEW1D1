package it.epicode.be;

import java.util.Arrays;

public class Es1 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a = 5;
	int b = 5;
	int prodotto = moltiplica(a,b);
	System.out.println("Il prodotto di " + a + " e " + b + " é: " + prodotto);
	
	
	String stringa = "Hello";
	int numero = 123;
        String risultato = concatena(stringa, numero);
        System.out.println("Risultato: " + risultato);
        
        
        String myArray[] = { "reb1", "reb2", "reb3", "reb4", "reb5" };        
	String newArray[] = inserisciInArray(myArray,"nuovaReb");
	
	System.out.println(Arrays.toString(newArray));
        
	}  
    
       
      

 
    
    
    public static int moltiplica(int a, int b ) {
	 	return a * b ;

}
    public static String concatena(String stringa, int numero) {
                return stringa + numero;
    }
    
    static String[] inserisciInArray(String[] myArray, String string) {

	int lengthArray = myArray.length;

	String risultato[] = new String[lengthArray + 1];

	for (int i = 0; i < risultato.length; i++) {

		if (i < 2) {
			risultato[i] = myArray[i];
		} else if (i == 2) {
			risultato[i] = string;
		} else {
			risultato[i] = myArray[i - 1];
		}
	}
	return risultato;
}
    
    
}

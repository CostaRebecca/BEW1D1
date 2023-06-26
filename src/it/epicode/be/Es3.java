package it.epicode.be;

public class Es3 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	double a = 5.5;
        double b = 3.8;
        double perimetro = perimetroRettangolo(a,b);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
        
        int c = 20;
        int pari = pariDispari(c);	
	System.out.println(pari);

    }
    
    public static double perimetroRettangolo(double a, double b) {
        return 2 * (a + b);
    }
    
    public static int pariDispari(int c) {
	
	if(c%2 == 0) {
		return 0;
	} else {
		return 1;
	}
}

}

package no.hvl.dat100;

import static javax.swing.JOptionPane.*;


public class Karakter {

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 10 ; i++) {
		
		String poengTxt = showInputDialog("Tast inn poengsum");
		int poeng = Integer.parseInt(poengTxt);
		String utTekst;
		
		if (poeng <= 100 && poeng >= 90) {
			System.out.println("Eleven oppn�dde karakter A med poengsum " + poeng);
			utTekst = "Eleven oppn�dde karakter A";
		} else if (poeng <= 89 && poeng >= 80) {
			System.out.println("Eleven oppn�dde karakter B med poengsum " + poeng);
			utTekst = "Eleven oppn�dde karakter B";
		} else if (poeng <= 79 && poeng >= 60) {
			System.out.println("Eleven oppn�dde karakter C med poengsum " + poeng);
			utTekst = "Eleven oppn�dde karakter C";
		} else if (poeng <= 59 && poeng >= 50) {
			System.out.println("Eleven oppn�dde karakter D med poengsum " + poeng);
			utTekst = "Eleven oppn�dde karakter D";
		} else if (poeng <= 49 && poeng >= 40) {
			System.out.println("Eleven oppn�dde karakter E med poengsum " + poeng);
			utTekst = "Eleven oppn�dde karakter E";
		} else if (poeng <= 39 && poeng >= 0) {
			System.out.println("Eleven oppn�dde karakter F med poengsum " + poeng);
			utTekst = "Eleven oppn�dde karakter F";
		} else {
			System.out.println("Verdien du tastet inn er ugyldig");
			utTekst = "Verdien du tastet inn er ugyldig";
			i--;
		}
		
		showMessageDialog(null, utTekst);
		
		

	}
	}

}

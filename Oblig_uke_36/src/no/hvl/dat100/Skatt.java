package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Skatt {

	public static void main(String[] args) {
		
		String belopTxt = showInputDialog("Hva er din bruttolønn?");
		int belop = Integer.parseInt(belopTxt);
		double sats = 0;
		
		if (belop < 164100) {
			sats = 0;
		} else if (belop >= 164101 && belop <= 230950) {
			sats = 0.93;
		} else if (belop >= 230951 && belop <= 580650) {
			sats = 2.41;
		} else if (belop >= 580651 && belop <= 934050) {
			sats = 11.52;
		} else if (belop >= 934051) {
			sats = 14.52;
		} else {
			System.out.println("Du har valgt et negativt tall");
		}
		
		double skatt = belop * (sats/100);
		
		System.out.println("Med bruttolønnen kr " + belop + " må du betale kr " + skatt + " i trinnskatt");
		
		String utTekst = "Med bruttolønnen kr " + belop + " må du betale kr " + skatt + " i trinnskatt";
		showMessageDialog(null, utTekst);

	}

}
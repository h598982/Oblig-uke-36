package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Fakultet {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Velg et tall?");
		int tall = Integer.parseInt(tallTxt);
		int svar = 1;
		
		for (int i = 1; i <= tall; i++) {
			
			svar *= i;
			
		}
		
		System.out.println(tall + "! = " + svar);
		String utTxt = tall + "! = " + svar;
		showMessageDialog(null, utTxt);
		
	}

}

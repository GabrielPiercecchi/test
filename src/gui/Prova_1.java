/**
 *
 */
package gui;

import javax.swing.*;

/**
 * @author gabri
 *
 */
@SuppressWarnings("unused")
public class Prova_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// commento github
		int somma = 0;
		int scelta;
		try {
			do {
				// pop-up: OutputInput --> chiesto in input un numero intero
				String s = JOptionPane.showInputDialog("Inserisci numero");
				somma += Integer.parseInt(s);//controlla che venga inserito un intero


				//pop-up: Scelta --> chiede se si vuole continuare
				scelta = JOptionPane.showConfirmDialog(null, "Vuoi continuare?",
						"Scelta", JOptionPane.YES_NO_OPTION);

			} while (scelta != JOptionPane.NO_OPTION);//ciclo se si sceglie 'YES'

			//pop-up: StampaMessaggio --> stampa il risultato
			JOptionPane.showMessageDialog(null, "La somma e': " + somma, "Answer", JOptionPane.INFORMATION_MESSAGE);
		}
		//eccezione se l'utente inserisce un valore errato
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "INSERITO VALORE NON INTERO\n"
					+ "Somma ultimi valori corretti: " + somma, "Inane error", JOptionPane.ERROR_MESSAGE);
		}

	}
}

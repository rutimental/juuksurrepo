package salong;

import java.applet.Applet;

import javax.swing.JFrame;

import salong.TextIO;

public class Salong {

	public static void main(String[] args) {

		// t�hi string, mis t�idetakse kasutaja sisestuga while ts�klis
		String liige = "";

		Juuksev2rv varv = new Juuksev2rv(); // varv on Juuksev2rv klassiobjekt
		System.out.println("Tere tulemast!");
		System.out.println("Soovite juukseid v�rvida?");
		String sKasVarvime = TextIO.getlnString();

		if (sKasVarvime.equals("Jah")) {
			System.out.println("Sinu uus juuksev�rv on: " + varv.juuksev2rv()); //
		} else {
			System.out.println("Selge, teinekord");
		}

		while (true) {

			System.out
					.println("Sisesta kaardi nimi (Gold, Silver v�i puudub) : ");

			liige = Visiitkaart(); // liige saab uue v��rtuse l�bi Visiitkaart
									// meetodi

			if ((liige.equals("Gold")) || ((liige.equals("Silver")))) {

				System.out.println("Sisestasid kliendikaardi.");

				break; // v2ljub while tsyklist kui sisestus on Silver v6i Gold
			}
			if (liige.equals("puudub")) {

				System.out
						.println("Kliendikaarti ei sisestatud, soodustused puuduvad.");

				System.exit(1); // v2ljub programmist kui soodustused puuduvad
			} else {

				continue; // iga muu sisestuse korral alustab tsyklit algusest
							// peale
			}
		}

		if ((liige.equals("Gold")) || ((liige.equals("Silver")))) {
			System.out.println("Sisesta ostusumma : ");
			int n = TextIO.getlnInt();
			if (liige.equals("Gold")) {
				System.out.println("Sinu soodustus : " + n * 20 / 100 + "�");
			} else {
				System.out.println("Sinu soodustus : " + n * 10 / 100 + "�");

			}
			JFrame frame1 = new JFrame(); // uus frame appletile
			frame1.setSize(500, 500);

			// visiitkaart klassist tehakse objekt applet1
			final Applet applet1 = new Visiitkaart();
			frame1.getContentPane().add(applet1);
			frame1.setVisible(true);

			// applet1 ehk visiit kaardi applet init ja k�vitamine
			applet1.init();
			applet1.start();
		}

	}

	public static String Visiitkaart() {

		String liige = TextIO.getln();

		return liige;

	}

}

/*
 * 	IHMSudoku.java						8 d�c. 2020
 *  3il info1 2020-2021 groupe 1, pas de droits : ni copyright ni copyleft
 */
package controle;

/**
 * TODO commenter les responsabilit�s de cette classe
 * @author Drakhis
 */
public class InterfaceIHMConsole implements InterfaceIHM {
	
	
	/**	M�thode pour ins�rer une valeur dans le sudoku */
	public void placerValeur() {
		
	}

	@Override
	public void afficherJeu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void placerValeur(int ligne, int colonne, String valeur, Case[][] grille) {
		if(grille[ligne][colonne].estJouable()) {
			grille[ligne][colonne].setValeur(valeur);
		}
	}
}

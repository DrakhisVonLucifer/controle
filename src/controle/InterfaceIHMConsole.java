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
		
	public static void main(String[] args) {
		System.out.println("-- Test de cr�ation --");
		GrilleSudoku grilleTest = new GrilleSudoku();
		System.out.println("-- Test afficherJeu --");
		afficherJeu(grilleTest.getGrille());
		System.out.println("-- Test placerValeur  --");
		InterfaceIHMConsole.placerValeur(0, 3, "1", grilleTest.getGrille());
		afficherJeu(grilleTest.getGrille());
		
	}
	
	/**	M�thode pour ins�rer une valeur dans le sudoku */
	public void placerValeur() {
		
	}
	
	/**
	 * Afficher l'�tat courant du sudoku dans la console
	 */
	public static void afficherJeu(Case[][] grille) {	
		for (int i = 0 ; i < grille.length ; i++) {
			System.out.print("|");
			for (int j = 0 ; j < grille[i].length ; j++) {
				System.out.print(" " + grille[i][j].getValeur() + " |");
			}
			System.out.println();
		}
	}

	/**
	 * TODO : Commenter la m�thode
	 * @param ligne
	 * @param colonne
	 * @param valeur
	 * @param grille
	 */
	public static void placerValeur(int ligne, int colonne, String valeur, Case[][] grille) {
		grille[ligne][colonne].setValeur(valeur);
	}
}

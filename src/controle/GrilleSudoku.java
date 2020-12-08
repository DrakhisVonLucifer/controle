/*
 * 	GrilleSudoku.java						8 déc. 2020
 *  3il info1 2020-2021 groupe 1, pas de droits : ni copyright ni copyleft
 */
package controle;

/**
 * TODO commenter les responsabilités de cette classe
 * @author Drakhis
 */
public class GrilleSudoku {
	/** Grille du sudoku */
	public Case[][] grille;
	
	/**
	 * Constructeur de GrilleSudoku.java
	 * Params : 
	 */
	public GrilleSudoku() {
		// TODO : Modifier l'initialisation en dur
		grille = new Case[4][4];
		grille[0][0] = new Case("1");
		grille[1][2] = new Case("2");
		grille[3][1] = new Case("3");
		grille[3][3] = new Case("4");
	}
	
	
}

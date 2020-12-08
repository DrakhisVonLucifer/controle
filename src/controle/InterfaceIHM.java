/*
 * 	IHM.java						8 d�c. 2020
 *  3il info1 2020-2021 groupe 1, pas de droits : ni copyright ni copyleft
 */
package controle;

/**
 * TODO commenter les responsabilit�s de cette classe
 * @author Drakhis
 */
public interface InterfaceIHM {

	/** G�n�ration du jeu */
	public void afficherJeu();
	
	/**	M�thode pour ins�rer une valeur dans le sudoku */
	public void placerValeur(int ligne, int colonne, String valeur, Case[][] grille);
}

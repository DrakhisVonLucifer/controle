/*
 * 	IHM.java						8 déc. 2020
 *  3il info1 2020-2021 groupe 1, pas de droits : ni copyright ni copyleft
 */
package controle;

/**
 * TODO commenter les responsabilités de cette classe
 * @author Drakhis
 */
public interface InterfaceIHM {

	/** Génération du jeu */
	public void afficherJeu();
	
	/**	Méthode pour insérer une valeur dans le sudoku */
	public void placerValeur(int ligne, int colonne, String valeur, Case[][] grille);
}

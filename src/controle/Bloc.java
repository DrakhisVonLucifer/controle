/*
 * 	Bloc.java					8 d�c. 2020
 *  3il info1 2020-2021 groupe 1, pas de droits : ni copyright ni copyleft
 */
package controle;

/**
 * TODO commenter les responsabilit�s de cette classe
 * @author Drakhis
 */
public class Bloc {
	/** Bloc de la grille */
	public Case[][] bloc;
	
	/** Constructeur par d�faut de GrilleSudoku.java, � modifier */
	public Bloc() {
		/* Initialisation de toutes les cases du bloc � " " */
		for (int i = 0 ; i < bloc.length ; i++) {
			for (int j = 0 ; j < bloc[i].length ; j++) {
				bloc[i][j] = new Case();
			}
		}
		// TODO : g�rer les cas ou les blocs ne sont pas des carr�s
		// TODO : Faire fonctionner GrilleSudoku avec des blocs
	}
	
	/**
	 * Recherche une valeur dans un bloc
	 * @param colonne
	 * @param valeur
	 * @return
	 * Return : Vrai si la valeur est pr�sente dans le bloc
	 * 			Faux sinon
	 */
	public boolean existeValeurBloc(/* int ligneBloc, int colonneBloc, */String valeur) {
		boolean estPresente = false;
		for (int i = 0 ; i < bloc.length ; i++) {
			for (int j = 0 ; j < bloc[i].length ; j++) {
				if(bloc[i][j].getValeur().equals(valeur)) {
					return true;
				}
			}
		}
		return estPresente;
	}
}

/*
 * 	Bloc.java					8 déc. 2020
 *  3il info1 2020-2021 groupe 1, pas de droits : ni copyright ni copyleft
 */
package controle;

/**
 * TODO commenter les responsabilités de cette classe
 * @author Drakhis
 */
public class Bloc {
	/** Bloc de la grille */
	public Case[][] bloc;
	
	/** Constructeur par défaut de GrilleSudoku.java, à modifier */
	public Bloc() {
		// TODO : gérer le bloc uniquement puis transformer GrilleSudoku en tableau à deux dimensions de bloc
		// TODO : gérer les cas ou les blocs ne sont pas des carrés
	}
	
	/**
	 * Recherche une valeur dans un bloc
	 * @param colonne
	 * @param valeur
	 * @return
	 * Return : Vrai si la valeur est présente dans le bloc
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

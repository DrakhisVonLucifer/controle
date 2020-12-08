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
		for (int i = 0 ; i < grille.length ; i++) {
			for (int j = 0 ; j < grille[i].length ; j++) {
				grille[i][j] = new Case();
			}
		}
		grille[0][0].setValeur("1");
		grille[1][2].setValeur("2");
		grille[3][1].setValeur("3");
		grille[3][3].setValeur("4");
		
		// TODO : Rendre la génération de blocs automatique
		/* Premier bloc */
		grille[0][0].setNumDuBloc(1);
		grille[0][1].setNumDuBloc(1);
		grille[1][0].setNumDuBloc(1);
		grille[1][1].setNumDuBloc(1);
		/* Second bloc */
		grille[0][2].setNumDuBloc(2);
		grille[1][2].setNumDuBloc(2);
		grille[0][3].setNumDuBloc(2);
		grille[1][3].setNumDuBloc(2);
		/* Troisième bloc */
		grille[2][0].setNumDuBloc(3);
		grille[2][1].setNumDuBloc(3);
		grille[3][0].setNumDuBloc(3);
		grille[3][1].setNumDuBloc(3);
		/* Quatrième bloc */
		grille[2][2].setNumDuBloc(4);
		grille[2][3].setNumDuBloc(4);
		grille[3][2].setNumDuBloc(4);
		grille[3][3].setNumDuBloc(4);
	}

	/** @return la valeur de grille */
	public Case[][] getGrille() {
		return grille;
	}

	/** @param grille le grille à affecter */
	public void setGrille(Case[][] grille) {
		this.grille = grille;
	}
	
	/**
	 * Recherche une valeur dans une ligne
	 * @param ligne
	 * @param valeur
	 * @return
	 * Return : Vrai si la valeur est présente dans la ligne
	 * 			Faux sinon
	 */
	public boolean existeValeurLigne(int ligne, String valeur) {
		boolean estPresente = false;
		for (int colonneCourante = 0 ; colonneCourante < grille[ligne].length ; colonneCourante++) {
			if(grille[ligne][colonneCourante].getValeur().equals(valeur)) {
				return estPresente = true;
			}
		}
		return estPresente;
	}
	
	/**
	 * Recherche une valeur dans une colonne
	 * @param colonne
	 * @param valeur
	 * @return
	 * Return : Vrai si la valeur est présente dans la colonne
	 * 			Faux sinon
	 */
	public boolean existeValeurColonne(int colonne, String valeur) {
		boolean estPresente = false;
		for (int ligneCourante = 0 ; ligneCourante < grille.length ; ligneCourante++) {
			if(grille[ligneCourante][colonne].getValeur().equals(valeur)) {
				return estPresente = true;
			}
		}
		return estPresente;
	}
	
	/**
	 * Recherche une valeur dans un bloc
	 * @param colonne
	 * @param valeur
	 * @return
	 * Return : Vrai si la valeur est présente dans le bloc
	 * 			Faux sinon
	 */
	public boolean existeValeurBloc(int numDuBloc, String valeur) {
		// TODO : Optimiser la méthode
		boolean estPresente = false;
		for (int i = 0 ; i < grille.length ; i++) {
			for (int j = 0 ; j < grille[i].length ; j++) {
				if(grille[i][j].getValeur().equals(valeur) && grille[i][j].getNumDuBloc() == numDuBloc) {
					return true;
				}
			}
		}
		return estPresente;
	}
	
}

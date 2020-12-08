/*
 * 	Case.java						8 déc. 2020
 *  3il info1 2020-2021 groupe 1, pas de droits : ni copyright ni copyleft
 */
package controle;

/**
 * TODO commenter les responsabilités de cette classe
 * @author Drakhis
 */
public class Case {
	public boolean estModifiable;
	public String valeur;
	public int numDuBloc;
	
	public boolean estJouable(){
		return estModifiable;
	}
	
	/**
	 * Constructeur de Case.java par défaut
	 */
	public Case() {
		estModifiable = true;
		valeur = " ";
		numDuBloc = 0;
	}

	/** @return la valeur de numDuBloc */
	public int getNumDuBloc() {
		return numDuBloc;
	}

	/** @param nbBloc le numDuBloc à affecter */
	public void setNumDuBloc(int numDuBloc) {
		this.numDuBloc = numDuBloc;
	}

	/**
	 * Constructeur de Case.java
	 * Params : @param estModifiable
	 * Params : @param valeur
	 */
	public Case(String valeur, int nbBloc) {
		super();
		this.estModifiable = false;
		this.valeur = valeur;
		this.numDuBloc = nbBloc;
	}

	/** @return la valeur de valeur */
	public String getValeur() {
		return valeur;
	}

	/** @param valeur le valeur à affecter */
	public void setValeur(String valeur) {
		if(this.estJouable()) {
			this.valeur = valeur;
		} else {
			System.out.println("Impossible de jouer la valeur ici.");
		}
	}
	
}

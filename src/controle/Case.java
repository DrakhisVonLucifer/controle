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
	
	public boolean estJouable(){
		return estModifiable;
	}
	
	/**
	 * Constructeur de Case.java par défaut
	 */
	public Case() {
		estModifiable = true;
		valeur = "";
	}

	/**
	 * Constructeur de Case.java
	 * Params : @param estModifiable
	 * Params : @param valeur
	 */
	public Case(String valeur) {
		super();
		this.estModifiable = false;
		this.valeur = valeur;
	}

	/** @return la valeur de valeur */
	public String getValeur() {
		return valeur;
	}

	/** @param valeur le valeur à affecter */
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
}

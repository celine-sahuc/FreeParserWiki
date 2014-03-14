package questions;
import parser.Type;
import reponse.Reponse;


public class Question {
	private Type type;
	private Reponse[] ensembleReponsePossibles;
	private int nombreReponsesCorrects;
	
	public Question(Type t, Reponse[] r, int nb) {
		this.type = t;
		this.ensembleReponsePossibles = r;
		this.nombreReponsesCorrects = nb;
	}
	
	public Type getType() {
		return this.type;		
	}
	
	public Reponse[] getListeReponses() {		
		return this.ensembleReponsePossibles;		
	}
	
	public int getNbReponsesCorrects() {
		return this.nombreReponsesCorrects;		
	}
}

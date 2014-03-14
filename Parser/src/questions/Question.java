package questions;
import java.util.ArrayList;

import parser.Type;
import reponse.Reponse;


public abstract class Question {
	private Type type;
	private ArrayList<Reponse> ensembleReponsePossibles;
	private int nombreReponsesCorrects;
	
	public Question(Type t, ArrayList<Reponse> r, int nb) {
		this.type = t;
		this.ensembleReponsePossibles = r;
		this.nombreReponsesCorrects = nb;
	}
	
	public Type getType() {
		return this.type;		
	}
	
	public ArrayList<Reponse> getListeReponses() {		
		return this.ensembleReponsePossibles;		
	}
	
	public int getNbReponsesCorrects() {
		return this.nombreReponsesCorrects;		
	}
	
	
}

package freeparserwiki.fpw.questions;
import java.util.ArrayList;
import java.util.Iterator;

import freeparserwiki.fpw.parser.Type;
import freeparserwiki.fpw.reponse.Reponse;


public abstract class Question {
	private Type type;
	private String question;
	private ArrayList<Reponse> ensembleReponsePossibles;
	private int nombreReponsesCorrects;
	
	public Question(Type t, String s, ArrayList<Reponse> r, int nb) {
		this.type = t;
		this.question = s;
		this.ensembleReponsePossibles = r;
		this.nombreReponsesCorrects = nb;
	}
	
	public Question(Type t, String s) {
		this.type = t;
		this.question = s;
		this.ensembleReponsePossibles = new ArrayList<Reponse>();
		this.nombreReponsesCorrects = 0;
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

	public int getNbReponses() {
		// TODO Auto-generated method stub
		return ensembleReponsePossibles.size();
	}

	public void addResponse(Reponse r) {
		// TODO Auto-generated method stub
		this.getListeReponses().add(r);
		if(r.isCorrect()) {
			nombreReponsesCorrects++;
		}
	}

	public boolean isValide() {
		// TODO Auto-generated method stub
		return (getNbReponses() != 0 && nombreReponsesCorrects > 0);

	}
}

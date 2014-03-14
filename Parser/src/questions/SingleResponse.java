package questions;

import java.util.ArrayList;

import parser.Type;
import reponse.Reponse;

public class SingleResponse extends Question {

	public SingleResponse(ArrayList<Reponse> r) {
		super(Type.SINGLE,r,1);
	}

	public Reponse getReponseCorrecte() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNbReponses() {
		// TODO Auto-generated method stub
		return this.getListeReponses().size();
	}

	public void addResponse(Reponse r) {
		// TODO Auto-generated method stub
		this.getListeReponses().add(r);
	}
}

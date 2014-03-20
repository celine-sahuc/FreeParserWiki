package freeparserwiki.fpw.questions;

import java.util.ArrayList;
import java.util.Iterator;

import freeparserwiki.fpw.parser.Type;
import freeparserwiki.fpw.reponse.Reponse;

public class SingleResponse extends Question {

	public SingleResponse(ArrayList<Reponse> r, String s) {
		super(Type.SINGLE,s, r,0);
	}
	
	public SingleResponse(String s) {
		super(Type.SINGLE, s, new ArrayList<Reponse>(),0);
	}	

	public boolean isValide() {
		return (getNbReponses() != 0 && this.getNbReponsesCorrects() == 1);
	}
}

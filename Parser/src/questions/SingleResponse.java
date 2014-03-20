package freeparserwiki.fpw.questions;

import freeparserwiki.fpw.parser.Type;

public class SingleResponse extends Question {

	public SingleResponse(String s) {
		super(Type.SINGLE, s);
	}

	public boolean isValide() {
		return (getNbReponses() != 0 && this.getNbReponsesCorrects() == 1);
	}
}

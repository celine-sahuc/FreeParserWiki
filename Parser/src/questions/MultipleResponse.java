package freeparserwiki.fpw.questions;

import freeparserwiki.fpw.parser.Type;

public class MultipleResponse extends Question {

	public MultipleResponse(String s) {
		super(Type.MULTIPLE, s);
	}

	public boolean isValide() {
		return (getNbReponses() != 0 && this.getNbReponsesCorrects() > 1);
	}
}

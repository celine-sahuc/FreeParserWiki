package questions;

import parser.Type;
import reponse.Reponse;

public class SingleResponse extends Question {

	public SingleResponse(Reponse[] r) {
		super(Type.SINGLE,r,1);
	}
}

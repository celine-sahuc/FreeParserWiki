/**
 * Classe Question a choix unique
 */
package freeparserwiki.fpw.questions;

import freeparserwiki.fpw.parser.Type;

public class SingleResponse extends Question {

    public SingleResponse(final String s) {
        super(Type.SINGLE, s);
    }

    public final boolean isValide() {
        return (getNbReponses() != 0 && this.getNbReponsesCorrects() == 1);
    }
}
